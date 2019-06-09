package com.in28minutes.oops.level2;

import java.math.BigDecimal;

public class Rectangle {

	//state / gblobal vafariable
	private int length;
	private int width;
	private BigDecimal degree;
	
	//creation/ cnaeosttrictor
	public Rectangle(int length, int width, BigDecimal degree) {
		this.length = length;
		this.width = width;
		this.degree = degree;
	}


	//operations
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public BigDecimal getDegree() {
		return degree;
	}

	public void setDegree(BigDecimal degree) {
		this.degree = degree;
	}

	public int area() {
		return length * width;
	}
	
	public int perimeter() {
		return 2 * (length + width);
	}
	
	public String toString() {
		return String.format("length = %d width = %d  degree = %d area = %d perimeter = %d",
				length, width, degree.intValue(), area(), perimeter());
	}
}
