package com.hazirlik.Polymorphism;

public class DaniloFamilyTester {

    public static void main(String[] args) {
       /*
       Methods are same, just by changing the variable or object or type of instance that i am storing in my basket
       I can get different outputs. All the output will be depending on the object type
        */
        // com.syntax.newClass23.DaniloParents daniloParents = new com.syntax.newClass23.DaniloParents();
        // DaniloParents daniloParents = new Danilo();//we store obj Danilo to the daniloParents bc
        // daniloParents are bigger. this is like type casting

        // com.syntax.newClass23.Danilo danilo=new com.syntax.newClass23.Danilo();//the first way of calling methods before polymorphism
        //danilo.eat();
        //danilo.sleep();
        // com.syntax.newClass23.Jelena jelena=new com.syntax.newClass23.Jelena();
        //jelena.eat();
        //jelena.sleep();
        ///com.syntax.newClass23.Milos milos=new com.syntax.newClass23.Milos();
        //milos.eat();
        //milos.sleep();
        //  daniloParents=new Milos();
        // daniloParents.run();gives error because parent class has 2 methods Milos has 3.parentclass cannot hold it

        //---- --- -------------------------------------------------------------------------------------
        //How we can do it without loss?I have to convert daniloParents type to Milos type
        //  daniloParents=(Milos)daniloParents;
        //   ((Milos) daniloParents).run();
        // milos.run();// i can call run method here no loss of information
/*
------------------------------------------------------------------------------------
        daniloParents=new Danilo();//the second way of calling methods with polymorphism
        daniloParents.eat();
        daniloParents.sleep();
        daniloParents= new Jelena();
        daniloParents.eat();
        daniloParents.sleep();
        daniloParents= new Milos();
        daniloParents.eat();
        daniloParents.sleep();
--------------------------------------------------------------------------------
*/
//        com.syntax.newClass23.DaniloParents[] familyArray = new com.syntax.newClass23.DaniloParents[3];
//        familyArray[0] = new Danilo();
//        familyArray[1] = new Jelena();
//        familyArray[2] = new Milos();

        //traditional approach
        //    print(danilo, jelena, milos);
        //advance polymorphism approach
        //        System.out.println("--------------------------------");
        // print(familyArray);
        // }

        //-------------------------------------------------------------------------------
        //   public static void print(Danilo danilo,Jelena jelena,Milos milos){//another way
//        danilo.eat();
//        danilo.sleep();
//        jelena.eat();
//        jelena.sleep();
//        milos.eat();
//        milos.sleep();
        //   }
        // public static void print(com.syntax.newClass23.DaniloParents[] daniloParents){
        //  for (DaniloParents dp:daniloParents//we are using this for loop to change the contents of this dp variable in every iteration (daniloparents)
        //  ) {
        //    dp.eat();  //and based on that obj we are calling these same method
        //     dp.sleep();
        /* dp.run();this gives error */

        //}
        //  }
    }
}