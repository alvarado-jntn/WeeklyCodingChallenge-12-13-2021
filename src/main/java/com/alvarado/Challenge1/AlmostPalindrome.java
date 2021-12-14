package com.alvarado.Challenge1;

public class AlmostPalindrome {

    public static Boolean almostPalindrome (String input) {

        int count = 0;
        int length = input.length();

        for (int i = 0; i < length ; i++) {
//            System.out.println("\ninput.charAt(i) :            " + input.charAt(i));
//            System.out.println("input.charAt(length - 1 - i) : " + input.charAt(length - 1 - i));
            if (input.charAt(i) != input.charAt(length - 1 - i)) {
                count ++ ;
            }
        }

        System.out.println("count: " + count + "\n");

        return count == 2;
    }
}
