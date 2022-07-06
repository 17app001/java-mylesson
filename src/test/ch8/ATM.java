package test.ch8;

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
    public void deposit(int amount) throws ATMExcepton {
        if (amount <= 0) {
            throw new ATMExcepton(ATMExcepton.DEPOSIT_ERROR_1);
        }

        balance += amount;
        System.out.printf("存款(%d)元成功\n目前餘額:%d%n",
                amount, balance);
    }

    // 提錢
    public void withdraw(int amount) throws ATMExcepton {
        if (amount <= 0) {
            throw new ATMExcepton(ATMExcepton.WITH_DRAW_ERROR_1);
        }
        if (amount > balance) {
            throw new ATMExcepton(ATMExcepton.WITH_DRAW_ERROR_2);
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

    class ATMExcepton extends Exception {
        public static final int WITH_DRAW_ERROR_1 = 0;
        public static final int WITH_DRAW_ERROR_2 = 1;
        public static final int DEPOSIT_ERROR_1 = 3;

        private int errCode;

        ATMExcepton(int errCode) {
            super("金額不正確");
            this.errCode = errCode;
        }

        public int getErrCode() {
            return errCode;
        }
    }

}
