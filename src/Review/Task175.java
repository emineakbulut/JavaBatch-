package Review;
/*
Create a Super Class Tea that will have:
instance variable teaType;
constructor that will initialize
unimplemented method addSugar(),
Create 2 subclasses of Tea as Lemon Tea and Chai Tea.
In main class create an object of 2 Child and assign them to Parent reference type.
Execute method addSugar from both classes.
Expected Output:
For Lemon Tea we need 2 spoons of sugar
For Chai Tea we need 1 spoon of sugar
 */
public abstract class Task175 {

    public static void main(String[] args) {

        Task175 lemonTea=new LemonTea("Lemon Tea");
        ChaiTea chaiTea=new ChaiTea("Chai Tea");
        lemonTea.addSugar();
        chaiTea.addSugar();
    }

    abstract void addSugar();

    String teaType;
    Task175(String teaType){
        this.teaType=teaType;
    }

    }
     class LemonTea extends Task175{

        LemonTea(String teaType){
            super(teaType);

        }
        void addSugar(){
            System.out.println("For "+teaType+" we need 2 spoons of sugar");
        }

    }
     class ChaiTea extends Task175{

        ChaiTea(String teaType){
            super(teaType);

        }

        void addSugar(){
            System.out.println("For "+teaType+" we need 1 spoon of sugar");
        }

    }


