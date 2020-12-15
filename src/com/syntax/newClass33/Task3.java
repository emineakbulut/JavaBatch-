package com.syntax.newClass33;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {

        //{768511=Printer, 768525=TV, 768551=Phone, 768549=soundBar, 768532=Laptop}
        //Retrieve all keys and values from a Best Buy map using EntrySet.

        Map<Integer, String> bestBuyElectronic = new HashMap<>();
        bestBuyElectronic.put(768511, "Printer");
        bestBuyElectronic.put(768525, "TV");
        bestBuyElectronic.put(768532, "Laptop");
        bestBuyElectronic.put(768549, "soundBar");
        bestBuyElectronic.put(768551, "Phone");
        System.out.println(bestBuyElectronic);
        Iterator<Map.Entry<Integer, String>> iterator = bestBuyElectronic.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry<Integer, String> next = iterator.next();
            System.out.print("{"+next+"} ");
        }


    }
}
