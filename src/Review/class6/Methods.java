package Review.class6;

public class Methods {
    public static void main(String[] args) {

        String name="Jack Plantin";
        //built-in are readonly we can't modify them
        System.out.println(name.length());
        Methods methods=new Methods();
        methods.getAndPrintLength("Jack");  //non static method call
        //if we don't write a method we have to repeat the code for all of the name

        String name1="Bryan Galarza ";
        if(name1.length()>15){
            System.out.println("Your name is too long");
        }else {
            System.out.println(" you are good to go");
        }
        String name2="Halime Cobanli ";
        if(name2.length()>15){
            System.out.println("Your name is too long");
        }else {
            System.out.println(" you are good to go");
        }
        String name3="general abdul rashid dustom aladin";
        if(name3.length()>15){
            System.out.println("Your name is too long");
        }else {
            System.out.println(" you are good to go");
        }

        //but if we write a method this is how it will look like

        methods.getAndPrintLength(name1);
        methods.getAndPrintLength(name2);
        methods.getAndPrintLength(name3);

    }

    public int getAndPrintLength(String name){
        int length=name.length();
        if(length>15){
            System.out.println("Your name is too long");
        }else {
            System.out.println(" you are good to go");
        }
        return length;
    }
}
