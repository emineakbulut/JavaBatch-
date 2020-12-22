package com.syntax.newClass32;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTester {
    public static void main(String[] args) {
        Insurance obj1 = new Pet("Healthy Paw Pet", "Cat");
        Insurance obj2 = new Car("Geico", "BMW");
        Insurance obj3 = new Health("Fidelis");//I created the objects
        ArrayList<Insurance> insuranceArrayList = new ArrayList<>();//I stored the objects
        insuranceArrayList.add(obj1);//adding objects 1 by 1
        insuranceArrayList.add(obj2);//insertion order bc its ArrayList
        insuranceArrayList.add(obj3);
        for (int i = 0; i < insuranceArrayList.size(); i++) {
            insuranceArrayList.get(i).getQuote();
            insuranceArrayList.get(i).cancelInsurance();
        }
        System.out.println();
        for (Insurance obj : insuranceArrayList) {
            obj.getQuote();
            obj.cancelInsurance();
        }
        System.out.println();
        Iterator<Insurance> iterator = insuranceArrayList.iterator();//iterator gives me back the objects
        while (iterator.hasNext()) {
            Insurance insurance= iterator.next();
            insurance.getQuote();
            insurance.cancelInsurance();

        }

    }

}
