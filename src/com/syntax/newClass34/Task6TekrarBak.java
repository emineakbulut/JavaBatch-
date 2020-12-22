package com.syntax.newClass34;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task6TekrarBak {
    /*
    Create a Map that will store Employee name and salary.
    Write a logic to retrieve an employee who gets the highest salary.
    Output should be in the below format-----> interview questions
    John Smith=$100000
     */

    public static void main(String[] args) {
        Map<String, Integer> employeeMap = new HashMap<>();
        employeeMap.put("Skywalker", 150_000);
        employeeMap.put("Kenobi", 175_000);
        employeeMap.put( "Palpatine", 999_999);
        employeeMap.put("Mike", 1_000_000);
        employeeMap.put("Solo", 1_000_000);
        employeeMap.put("Leia", 671_000);
        System.out.println(employeeMap);

        Iterator<Map.Entry<String, Integer>> iterator = employeeMap.entrySet().iterator();

        int highestSalary = 0;

        Map<String,Integer> highestSalaryMap=new HashMap<>();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            if (next.getValue() > highestSalary) {
                highestSalary = next.getValue();
            }
        }

        for (Map.Entry<String, Integer> originalMap:employeeMap.entrySet()
        ) {
            if(originalMap.getValue()==highestSalary){
                highestSalaryMap.put(originalMap.getKey(),originalMap.getValue());
            }

        }

        for (Map.Entry<String, Integer> var:highestSalaryMap.entrySet()

        ) {
            System.out.println(var.getKey()+" $"+var.getValue());
        }
    }
}
