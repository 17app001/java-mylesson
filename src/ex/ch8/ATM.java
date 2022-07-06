package ex.ch8;

public class ATM {
    private int balance;
    private boolean loginSuccess;
    private String name;
    private String password;

    ATM(String name, String password) {
        this.name = name;
        this.password = password;
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
    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("金額不正確.");
            return;
        }

        balance += amount;
        System.out.printf("存款(%d)元成功\n目前餘額:%d%n",
                amount, balance);
    }

    // 提錢
    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("金額不正確.");
            return;
        }

        if (amount > balance) {
            System.out.println("提款金額大於餘額.");
            return;
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

}
