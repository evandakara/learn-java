package com.in28minutes.oops;

public class Book extends Object {

    //propetri keals
    private int numberOfKopis;

    // constructor dari1 java1
    public Book() {
    }

    //constrcuktor kustpom satu
    public Book(String p) {
        System.out.println("Hello0 " + p);
    }

    // kontrucorto buatan vani kostum, dua
    public Book(int numberOfKopis) {
        this.numberOfKopis = numberOfKopis;
    }

    // kastem tiga
    public Book(int noCopied, String p) {
        this.numberOfKopis = noCopied;
        System.out.println("Hello1 " + p);
    }

    //setter
    public void setNumberOfKopis(int numberOfKopis) {
        if (numberOfKopis > 0) {
            this.numberOfKopis = numberOfKopis;
        }
    }

    //me toad
    public void increaseNumberOfKopis(int howMuch) {
        setNumberOfKopis(this.numberOfKopis + howMuch);
    }
    //juga ,me tod
    public void decreaseNumberOfKopis(int howMuch) {
        setNumberOfKopis(this.numberOfKopis - howMuch);
    }

    //ambiler
    public int getNumberOfKopis() {
        return numberOfKopis;
    }
}