package com.in28minutes.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class GenericsRunner {

    static <X> X doubleValue(X value) {
        return value;
    }

    static <X extends List> void duplicate(X list) {
        list.addAll(list);
    }

    static double sumOfNumberList(
            List<? extends Number> numbers) {
        double sum = 0.0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    static void addACoupleOfValues(
            List<? super Number> numbers) {
        numbers.add(1);
        numbers.add(1.0);
        numbers.add(1.0f);
        numbers.add(1l);
    }

    public static void main(String[] args) {
		List emptyList = new ArrayList<Number>();
		addACoupleOfValues(emptyList);
		System.out.println(emptyList);

		System.out.println(
				sumOfNumberList(Arrays.asList(1, 2, 3, 4, 5)));
		System.out.println(sumOfNumberList(
				Arrays.asList(1.1, 2.1, 3.1, 4.1, 5.1)));
		System.out.println(sumOfNumberList(
				Arrays.asList(1l, 2l, 3l, 4l, 5l)));

		String value1 = doubleValue(new String());
		Integer number1 = doubleValue(Integer.valueOf(5));
		ArrayList list1 = doubleValue(new ArrayList());

		LinkedList<Integer> numbers = new LinkedList<>(
				Arrays.asList(1, 2, 3));
		duplicate(numbers);
		System.out.println(numbers);
//
        MyCustomList<String> list = new MyCustomList<>();
        list.addElement("Element 1");
        list.addElement("Element 2");
        String value = list.get(0);

        System.out.println(value);

        MyCustomList<Integer> list2 = new MyCustomList<>();
        list2.addElement(Integer.valueOf(5));
        list2.addElement(Integer.valueOf(7));
        Integer number = list2.get(0);
        System.out.println(number);

        MyCustomList<Double> list3 = new MyCustomList<>();
        list3.addElement(Double.valueOf(5.0));
        list3.addElement(Double.valueOf(7.0));
        Double numero = list3.get(0);
        System.out.println(numero);

    }

}
