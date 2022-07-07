package lesson11.atm;

public class ATM {
    private int balance;
    private boolean loginSuccess;
    private String name;
    private String password;

    public ATM(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public boolean isLogin() {
        return loginSuccess;
    }

    public void login(String name, String password) {
        if (this.name.equals(name) && this.password.equals(password)) {
            loginSuccess = true;
            System.out.println("登入成功");
        } else {
            loginSuccess = false;
            System.out.println("登入失敗");
        }
    }

    // 存錢
    public void deposit(int amount) throws CheckAmountException {
        if (amount <= 0) {
            throw new CheckAmountException(amount);
        }

        balance += amount;
        System.out.printf("存款(%d)元成功\n目前餘額:%d%n",
                amount, balance);
    }

    // 領錢函式(丟出例外由呼叫方處理)
    public void withdraw(int amount) throws WithDrawException, CheckAmountException {
        if (amount <= 0) {
            throw new CheckAmountException(amount);
        }

        // 餘額不足，丟出例外
        if (amount > balance) {
            throw new WithDrawException(amount);
        }

        balance -= amount;
        System.out.printf("提款(%d)元成功\n目前餘額:%d%n",
                amount, balance);

    }

    @Override
    public String toString() {
        return String.format("ATM balance:%d Login:%b Username:%s Password:%s",
                balance, loginSuccess, name, password);
    }

    public class WithDrawException extends Exception {
        private int amount;

        // 建構式
        WithDrawException(int amount) {
            // 呼叫Exception建構式(帶參數錯誤資訊)
            super("餘額不足");
            this.amount = amount;
        }

        public int getAmount() {
            return amount;
        }
    }

    public class CheckAmountException extends Exception {
        private int amount;

        // 建構式
        CheckAmountException(int amount) {
            // 呼叫Exception建構式(帶參數錯誤資訊)
            super("金額不能夠小於等於零");
            this.amount = amount;
        }

        public int getAmount() {
            return amount;
        }
    }

}
