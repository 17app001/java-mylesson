package practise.ch13;

public class Student {

    String name;
    double weight;
    double height;
    double bmi;

    Student(String name) {
        this.name = name;
    }

    void setBMI(double bmi) {
        this.bmi = bmi;
    }
}
