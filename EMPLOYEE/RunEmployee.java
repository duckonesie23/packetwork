package EMPLOYEE;

public class RunEmployee {
    public static void main(String[]args){
        Employee e = new Employee(40000);
        e.increase(2000);
        double p = e.getPay();
        System.out.println("Salary is "+p);
        e.increase(-500.0);
        p=e.getPay();
        System.out.println("Salary is "+p);
        e.increase(3000);
        p=e.getPay();
        System.out.println("Salary is "+p);
    }
}
