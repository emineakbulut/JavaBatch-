package com.hazirlik;

public class Recap {
    String name;
    int age;

    public Recap(String name, int age){
        this.name =name;
        this.age = age;
    }

    int calculate (){
        return age+3;
    }
void brother (){
    System.out.println("reco");
    age++;
//    age++;
//    age--;
}
String nameOfEmine(){
    return name;
}


    public static void main(String[] args) {
        Recap recep = new Recap("recep",34);
        Recap hilal = new Recap("hilal", 27);
        recep.brother(); // +1 yapti

        //System.out.println(recep.age);
       // System.out.println(recep.nameOfEmine());
        System.out.println(hilal.age);
        System.out.println(recep.age);


    }
}
