package chapter4.example2.arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayAsList {

    public static void main(String[] args) {

        Double[] temparatureArray = {31.1, 23.5, 56.2, 15.0, 12.6};
        
        System.out.println("Original Array: " + Arrays.toString(temparatureArray));

        List<Double> temperatureList = Arrays.asList(temparatureArray);
        //temperatureList.add(12.0);
        temperatureList.set(0, 100.0);
        System.out.println("Modified: " + temperatureList);
    }

}
