package com.in28minutes.exceptionhandling;

public class CheckedExceptionRunner {

    public static void main(String[] args) {
//		try {
//			someOtherMethod();
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
        //someOtherMethod1();
        try {
            someOtherMethod2();
        } catch (RuntimeException re) {
            // e.printStackTrace();
            System.out.println("dicetak dari RuntimeException");
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println("dicetak dari Exception");
        } finally {
            System.out.println("srverge sibuk WAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        }
    }

    private static void someOtherMethod2() {
        throw new RuntimeException();
    }

    private static void someOtherMehod() throws InterruptedException {
        Thread.sleep(2000);
    }

}
