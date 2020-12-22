package com.syntax.newClass32;

public abstract class Flower {

    String color;
    String name;
    Flower (String type,String color){
        this.name=type;
        this.color=color;
    }
    public abstract void bloom();
}
class Rose extends Flower{
    Rose(String type,String color){
        super(type,color);

    }
    public void bloom(){
        System.out.println(name+" Blooms in the March");
    }
}
class Tulip extends Flower{

    Tulip(String type, String color) {
        super(type, color);
    }

    @Override
    public void bloom() {
        System.out.println(name+" Bloom in April");
    }
}
class SunFlower extends Flower{

    SunFlower(String type, String color) {
        super(type, color);
    }

    @Override
    public void bloom() {
        System.out.println(name+" Bloom in August");
    }
}