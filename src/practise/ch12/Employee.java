package practise.ch12;

public class Employee implements Comparable<Employee> {
    private String name;
    private double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {

        return this.salary - ((Employee) o).salary == 0 ? 0 : this.salary - ((Employee) o).salary > 0 ? 1 : -1;

    }
}
