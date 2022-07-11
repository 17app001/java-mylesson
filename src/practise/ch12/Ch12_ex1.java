package practise.ch12;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ch12_ex1 {
    public static void main(String[] args) {
        Set<Employee> set = new TreeSet<Employee>().descendingSet();

        set.add(new Employee("Jerry", 60000));
        set.add(new Employee("Mary", 55000));
        set.add(new Employee("Michael", 70000));
        set.add(new Employee("Michelle", 35000));
        set.add(new Employee("Michelle", 35000));

        Object[] employee = set.toArray();
        System.out.println("================================");
        System.out.println("薪資排行榜");

        for (Object o : employee) {
            System.out.println(((Employee) o).getName());
            System.out.println(((Employee) o).getSalary());
        }

        System.out.println("================================");
        System.out.println("薪資大於50000的員工");

        Iterator<Employee> it = set.iterator();

        while (it.hasNext()) {
            Employee e = (Employee) it.next();

            if (e.getSalary() >= 50000) {
                System.out.println(e.getName());
            }
        }

    }
}
