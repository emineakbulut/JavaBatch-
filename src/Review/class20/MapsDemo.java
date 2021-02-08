package Review.class20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapsDemo {
    public static void main(String[] args) {

        HashMap<String,Double>hashMap=new HashMap<>();
        hashMap.put("Eggs",12.99);
        hashMap.put("Milk",10.0);
        hashMap.put("Cake",20.0);

//        Iterator<Map.Entry<String,Double>> iterator=hashMap.entrySet().iterator();
//        while (iterator.hasNext()){
//            Map.Entry<String,Double>element=iterator.next();
//            if (element.getValue()>10){
//                iterator.remove();
//            }
//
//        }
        hashMap.entrySet().removeIf(element->element.getValue()>10);//lambda
        System.out.println(hashMap);

    }

}
