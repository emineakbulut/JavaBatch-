package Review.class11;

public abstract class Person {
    String name;
    Person(String name){

    }
    abstract void print();
}
class Employee extends Person{
    String grade;
    String dept;

    Employee(String name,String grade,String dept) {
        super(name);
        this.grade=grade;
        this.dept=dept;
    }

    @Override
    void print() {
        System.out.println("");
    }
}
