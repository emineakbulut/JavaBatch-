package Review.class15;

public abstract class Employee {
    double salary;
    double bonus;
    double medicalAllowence;
    public abstract void getPaid();

}

class FullTimeEmployee extends Employee{

    @Override
    public void getPaid() {
        System.out.println("Salary "+(salary+bonus+medicalAllowence));
    }
}

