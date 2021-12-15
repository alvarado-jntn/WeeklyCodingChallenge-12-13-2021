package com.alvarado.ChallengeTests;

import org.junit.*;
import static org.junit.Assert.*;
import com.alvarado.Challenge2.RecursionStaircase ;

public class StaircaseTests {

    @Test
    public void test1() {
        Integer x = 1;
        System.out.println("Testing 1 step");
        assertEquals(x, RecursionStaircase.waysToClimb(1));
    }

    @Test
    public void test2() {
        int steps = 2;
        Integer x = 2;

        System.out.println("Testing " + steps + " steps");
        assertEquals(x, RecursionStaircase.waysToClimb(steps));
    }

    @Test
    public void test3() {
        int steps = 3;
        Integer x = 3;

        System.out.println("Testing " + steps + " steps");
        assertEquals(x, RecursionStaircase.waysToClimb(steps));
    }

    @Test
    public void test4() {
        int steps = 4;
        Integer x = 5;

        System.out.println("Testing " + steps + " steps");
        assertEquals(x, RecursionStaircase.waysToClimb(steps));
    }

    @Test
    public void test5() {
        int steps = 5;
        Integer x = 8;

        System.out.println("Testing " + steps + " steps");
        assertEquals(x, RecursionStaircase.waysToClimb(steps));
    }

    @Test
    public void test6() {
        int steps = 6;
        Integer x = 13;

        System.out.println("Testing " + steps + " steps");
        assertEquals(x, RecursionStaircase.waysToClimb(steps));
    }

}
