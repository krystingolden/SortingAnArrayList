package com.pluralsight;

import java.util.ArrayList;

public class Main {

    /*
    https://programmingbydoing.com/
    Sorting an arraylist - Assignment #187
     */

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(45);
        arr.add(87);
        arr.add(39);
        arr.add(32);
        arr.add(93);
        arr.add(86);
        arr.add(12);
        arr.add(44);
        arr.add(75);
        arr.add(50);



        // Display the original (unsorted values)
        System.out.print("before: ");
        for ( int i=0; i<arr.size(); i++ )
            System.out.print( arr.get(i) + " " );
        System.out.println();

        // Swap the values around to put them ascending order.

        for ( int a = 0; a < arr.size(); a++ )
        {
            for ( int b = 0; b < arr.size() ; b++)
            {
                if (arr.get(b) > arr.get(a))
                {
                    // swap the values in two slots
                    int tempInt = arr.get(a);
                    arr.set(a, arr.get(b));
                    arr.set(b, tempInt);
                }
            }
        }


        // Display the values again, now (hopefully) sorted.
        System.out.print("after : ");
        for ( int i=0; i<arr.size(); i++ )
            System.out.print( arr.get(i) + " " );
        System.out.println();
    }
}
