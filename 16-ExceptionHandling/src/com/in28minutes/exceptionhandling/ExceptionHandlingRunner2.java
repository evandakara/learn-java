package com.in28minutes.exceptionhandling;

public class ExceptionHandlingRunner2 {

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("catch di method main");
        }
        System.out.println("Main Ended");
    }

    private static void method1() {
        try {
            method2();
            System.out.println("Method1 Ended");
        } catch (Exception e) {
            System.out.println("catch di method1");
        }
    }

    private static void method2() {
//		try {
        //String str = null;
        //str.length();
        int[] i = {1, 2};
        int number = i[3];
        System.out.println("Method2 Ended");
//		} catch (NullPointerException ex) {
//			System.out.println("Matched NullPointerException");
//			ex.printStackTrace();
//		} catch (ArrayIndexOutOfBoundsException ex) {
//			System.out.println("Matched ArrayIndexOutOfBoundsException");
//			ex.printStackTrace();
//		} catch (Exception ex) {
//			System.out.println("Matched Exception");
//			ex.printStackTrace();
//		}
    }
}
