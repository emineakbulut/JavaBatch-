package com.syntax.newClass33;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo7
{
    public static void main(String[] args) {
        HashMap<String,Double> storeItemsDay1=new HashMap<>();
        storeItemsDay1.put("Milk",3.2);
        storeItemsDay1.put("Bread",0.6);
        storeItemsDay1.put("Cake",40.0);
        storeItemsDay1.put("Diaper",39.99);
        storeItemsDay1.put("Eggs",4.99);

        HashMap<String,Double> storeItemsDay2=new HashMap<>();
        storeItemsDay2.put("beer",12.0);
        storeItemsDay2.put("coffee",5.0);
        storeItemsDay2.put("snack",5.0);

//        System.out.println(storeItemsDay2.get(null)); //null
//        System.out.println(storeItemsDay2.get("lion"));//null

        storeItemsDay2.putAll(storeItemsDay1);//combining 2 maps
        Set<String> set=storeItemsDay2.keySet();
        Iterator<String> iterator =set.iterator();

        Double sum=0.0;


//        for (String item:set
//             ) {
//            sum+=storeItemsDay2.get(item);
//        }
//        System.out.println("Total spending "+sum);//works

        //   storeItemsDay2.remove("beer"); Runtime Error
        while (iterator.hasNext()){
            String item=iterator.next();
            if(storeItemsDay2.get(item)!=null){
                sum+=storeItemsDay2.get(item);
            }
        }
        System.out.println(storeItemsDay2.size());
        System.out.println("Total spending "+sum);



        //We will look into this in the next class


        /* for (String item:set
             ) {
            if(item.equals("beer")){
                storeItemsDay2.remove(item);
            }
            if(storeItemsDay2.get(item)!=null){
                sum+=storeItemsDay2.get(item);  //Exception...never use foreach to remove the items
            }
        }*/

    }
}
