package com.alvarado.ChallengeTests;

import org.junit.*;
import static org.junit.Assert.*;
import com.alvarado.Challenge1.AlmostPalindrome;

public class AlmostPalindromeTest {

    @Test
    public void test1() {
        System.out.println("Running Test \"abcdcbg\" ");
        assertEquals(true, AlmostPalindrome.almostPalindrome("abcdcbg"));

    }

    @Test
    public void test2() {
        System.out.println("Running Test \"abccia\" ");
        assertEquals(true, AlmostPalindrome.almostPalindrome("abccia"));

    }

    @Test
    public void test3() {
        System.out.println("Running Test \"abcdaaa\" ");
        assertEquals(false, AlmostPalindrome.almostPalindrome("abcdaaa"));

    }

    @Test
    public void test4() {
        System.out.println("Running Test \"1234312\" ");
        assertEquals(false, AlmostPalindrome.almostPalindrome("1234312"));

    }

}
