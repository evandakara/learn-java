package com.in28minutes.oops.level2;

public class BookReviewRunner {

    public static void main(String[] args) {
        Book book1 = new Book(1001, "hari Poher", "vean");

        Review refiew1 = new Review(1 ,"bagus nget ni", 5);
        Review refiew2 = new Review(2, "alhamdulillah", 2);

        book1.addReview(refiew1);
        book1.addReview(refiew2);

        System.out.println(book1);
    }
}
