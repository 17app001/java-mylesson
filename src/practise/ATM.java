package practise;

public class ATM {

    private int balance;
    private boolean loginSuccess;
    private String name;
    private String password;

    ATM(String name, String password) {
        this.name = name;
        this.password = password;
        loginSuccess = false;
    }

    public void login(String name, String password) {
        if (this.name.equals(name) && this.password.equals(password)) {
            loginSuccess = true;
            System.out.println("登入成功!");
        } else {
            System.out.println("登入失敗!");
        }
    }

    /**
     * 領錢
     * 
     * @param amount
     */
    public void deposit(int amount) {
        if (!loginSuccess) {
            System.out.println("未登入...");
            return;
        }

        if (amount <= 0) {
            System.out.println("存款失敗，金額不能小於等於0");
            return;
        }
        balance += amount;
        System.out.println("存款成功!");
        System.out.println("目前餘額為:" + balance);
    }

    /**
     * 提款
     * 
     * @param amount
     * @return
     */
    public void withdraw(int amount) {
        if (!loginSuccess) {
            System.out.println("未登入...");
            return;
        }

        if (balance <= 0) {
            System.out.println("提款失敗，金額不能小於等於0");
        } else if (amount > balance) {
            System.out.println("提款失敗，金額不能大於餘額");
        } else {
            balance -= amount;
            System.out.println("提款成功!");
            System.out.println("目前餘額為:" + balance);
        }
    }

    @Override
    public String toString() {
        if (!loginSuccess) {
            return "未登入...";
        }

        return "ATM{" +
                "balance=" + balance +
                ", loginSuccess=" + loginSuccess +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
