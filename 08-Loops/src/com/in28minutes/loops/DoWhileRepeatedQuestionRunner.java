package com.in28minutes.loops;

import java.util.Scanner;

public class DoWhileRepeatedQuestionRunner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int number = -1;
        boolean isFinish = false;
		do {
			if (number != -1) {
				System.out.println("Cube is " + (number * number * number));
				isFinish = true;
			} else {
                System.out.print("Enter a number: ");
                number = scanner.nextInt();
            }
		} while (number >= 0 && isFinish == true);
		System.out.print("Tha0nk You! Have Fun!");
	}

}
