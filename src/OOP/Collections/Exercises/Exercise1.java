package OOP.Collections.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercise1 {
    /*Write a Java program to perform the following operations on a list
     of doubles:- Square each element in the list.
     - Calculate the sum of the squared values.
     - Find the average of the squared values.
     - Display the modified list and the results of the calculations.
     */

    public static void main(String[] args) {
        List<Double> doubleList = new ArrayList<>();

        Random random = new Random();
        Double sum = 0.0;
        Double mesatarja = 0.0;
        for (int i = 0;i< 15; i++){
            double value = random.nextDouble() * (15 - 1) + 15;
            doubleList.add(value);
        }
        List<Double> squareList = new ArrayList<>();
        //ngrini ne katror cdo element dhe ruajeni ne nje liste te dyte
        for (Double d : doubleList){
            squareList.add(Math.pow(d,2));
            sum = sum + Math.pow(d,2);
        }
        //mesatarja
        mesatarja = sum / squareList.size();
        System.out.println("Lista e pamodifikuar");
        for (Double i : doubleList){
            System.out.print(i + " ");
        }
        System.out.println("Lista e modifikuar");
        for (Double i : squareList){
            System.out.print(i + " ");
        }
    }
}
