package Review.class12;

public class Parent {
    protected  String name="Jon";
    protected void parentPrintMethod(){
        System.out.println(name);
    }
}
class Child extends Parent{
    String name="Jane";

    protected void childPrintMethod() {
        System.out.println(name);
        System.out.println(super.name);
    }
    public void printAll(){

    }
}