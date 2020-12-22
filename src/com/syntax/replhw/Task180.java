package com.syntax.replhw;

public class Task180 {
    public static void main(String[] args) {
        EncapsulationDemo main=new EncapsulationDemo();
        //main.setName("John");
        //main.setAge(30);
        System.out.println("Employee Name: "+main.getName());
        System.out.println("Employee Age: "+main.getAge());
    }
}
class EncapsulationDemo{

    private String empName="aa";
    private int empAge=30;

//    public void setName(String empName){
//        this.empName=empName;
//    }

    public String getName() {
        return empName;
    }
//        public void setAge( int empAge){
//            this.empAge = empAge;
//        }
        public int getAge(){
            return empAge;
        }
    }

