package EMPLOYEE;

public class Employee {
    double salary = 0;
    public Employee(double s){
        salary = s;
    }
    public double getPay(){
        return salary;
    }
    public void increase(double s){
        if(s>0){
            salary = salary +s;
        }
    }
}
