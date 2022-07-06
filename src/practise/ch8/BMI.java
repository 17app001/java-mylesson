package practise.ch8;

public class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;
    private double bmi;

    // 建構式
    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        // 轉換成公尺
        this.height = height / 100;
        bmi = 0;
    }

    // 建構式(預設年紀為20)
    public BMI(String name, double weight, double height) {
        this.name = name;
        this.age = 20;
        this.weight = weight;
        // 轉換成公尺
        this.height = height / 100;
        bmi = 0;
    }

    /**
     * 回傳BMI值
     *
     * @return
     */
    public double getBMI() {
        // 體重/身高*身高
        bmi = weight / (height * height);
        return bmi;
    }

    /**
     * 將 BMI回傳
     *
     * @return
     */
    public String getStatus() {
        return name + "," + age +
                "," + String.format("%.2f", getBMI());
    }
}
