package com.hazirlik.interviewQ;

import java.io.*;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Result {
    public static int getMostVisited(int n, List sprints)
    {
        int[] arr=new int[n+2]; //array for storing total times a position is visited.initialised with 0.
        int a,b,mx=0,ans=1; //max stores the max visited value and ans stores the max visited position
        for(int i=0;i<sprints.size()-1;i++)
        {
            a=(int)sprints.get(i); //storing ith value in a
            b=(int)sprints.get(i+1); //storing i+1 th value in b
//increasing the count of smaller position by 1 and decreasing the count of (larger position+1) by 1
            if(a>b)
            {
                arr[b]++;
                arr[a+1]--;
            }
            else
            {
                arr[a]++;
                arr[b+1]--;
            }
        }
        for(int i=1;i<=n;i++)
        {
            arr[i]=arr[i]+arr[i-1]; //prefix sum
        }
        for(int i=1;i<=n;i++)
        {
            if(arr[i]>mx) //checking the position with larger value
            {mx=arr[i]; ans=i;}
        }
        return ans; //return the max visited position
    }
}
class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int sprintsCount = Integer.parseInt(bufferedReader.readLine().trim());
        List sprints = IntStream.range(0, sprintsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }).map(String::trim).map(Integer::parseInt).collect(toList());
        int result = Result.getMostVisited(n, sprints);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }

}
