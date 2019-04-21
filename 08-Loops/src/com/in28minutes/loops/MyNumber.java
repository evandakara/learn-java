package com.in28minutes.loops;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;
import com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets;

import java.util.ArrayList;
import java.util.List;

public class MyNumber {

    private int number;

    public MyNumber(int number) {
        this.number = number;
    }

    public boolean isPrime() {
        // 2 to number-1
        // How can check if a number is divisible by 2?

        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int sumUptoN() {
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum = sum + 2;
        }

        return sum;
    }

    public int sumOfDivisors() {
        // 6 except 1 , 6 => 2,3
        // 2 + 3 + 4 + 5

        int sum = 0;

        for (int i = 1; i <= number - 1; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        return sum;
    }

    public void printNumberTriangle() {

        // 1			   1
        // 1 2		     2 1
        // 1 2 3       3 2 1
        // 1 2 3 4   4 3 2 1
        // 1 2 3 4 5 4 3 2 1
        // 1 2 3 4   4 3 2 1
        // 1 2 3       3 2 1
        // 1 2           2 1
        // 1			   1

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }

    public void alhamdulillah() {

        for (int o = 1; o <= number; o++) {
            System.out.println(o);
        }
    }

    public List<Integer> getTrain(){
        List<Integer> listResult =  new ArrayList<>();

        for (int i = 1; i <= number; i++) {
            listResult.add(i);
        }
        return listResult;
    }
}
