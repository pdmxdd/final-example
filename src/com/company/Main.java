package com.company;

import java.util.Arrays;

public class Main {
    // declaring and intializing a final double called PI:
    private static final double PI = 3.1415;

    private static final int[] oddNumbers = {1, 3, 5, 7, 9};

    public static void main(String[] args) {
        // we can access the final double by name:
        System.out.println(PI);

        // we cannot change the variable that is marked final
//        PI = 15.15;

        // we can access the final oddNumbers array
        System.out.println(Arrays.toString(oddNumbers));

        // we cannot change the final variable outright
//        oddNumbers = {2, 4, 6, 8, 10};

        // we CAN change the individual elements within the final array:
        oddNumbers[0] = 2;
        oddNumbers[1] = 4;
        oddNumbers[2] = 6;
        oddNumbers[3] = 8;
        oddNumbers[4] = 10;
        System.out.println(Arrays.toString(oddNumbers));
    }
}
