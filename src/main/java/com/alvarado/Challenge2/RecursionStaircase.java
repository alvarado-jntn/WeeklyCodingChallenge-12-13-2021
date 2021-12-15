package com.alvarado.Challenge2;

public class RecursionStaircase {

    public static Integer waysToClimb (int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else {
            return waysToClimb(n - 1) + waysToClimb(n - 2) ;
        }

    }
}
