package com.in28minutes.oops;

public class BookRunner {
    public static void main(String[] args) {

        // Create a new class called Book
        // Create three instances
        Book artOfComputerProgramming = new Book();
        Book effectiveJava = new Book();
        Book cleanCode = new Book();
        Book m = new Book("evan");
        Book p = new Book(6000);
        Book t = new Book(8, "gio");

        artOfComputerProgramming.setNumberOfKopis(100);
        effectiveJava.setNumberOfKopis(50);
        cleanCode.setNumberOfKopis(45);

        artOfComputerProgramming.increaseNumberOfKopis(999);
        effectiveJava.increaseNumberOfKopis(998);
        cleanCode.decreaseNumberOfKopis(5);
    }

}