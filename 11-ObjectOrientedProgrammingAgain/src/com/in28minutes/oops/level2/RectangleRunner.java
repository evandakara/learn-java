package com.in28minutes.oops.level2;

import java.math.BigDecimal;

public class RectangleRunner {

	public static void main(String[] args) {
		Double d = Double.valueOf(384729254.7575757757557757575464749654454668576895475654742652484255342425423);
		Rectangle rectangle = new Rectangle(12, 23, BigDecimal.valueOf(90));
		System.out.println(rectangle);
		rectangle.setWidth(25);
		System.out.println(rectangle);
	}

}
