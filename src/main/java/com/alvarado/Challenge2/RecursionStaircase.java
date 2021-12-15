package com.alvarado.Challenge2;

public class RecursionStaircase {

    public static Integer waysToClimb (int n) {

        // after writing out by hand the first 6 staircases, it appears the pattern follows the
        // Fibonacci sequence, which is a recursive function.

        if (n == 0 || n == 1) {
            return 1;
        } else {
            return waysToClimb(n - 1) + waysToClimb(n - 2) ;
        }

    }
}
