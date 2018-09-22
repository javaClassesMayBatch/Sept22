package com.java.demo.lambdaDemo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CodeRunner {
	public static void main(String[] a) {
		List<String> list = new ArrayList<String>();
		list.add("Shubham");
		list.add("Ritesh");
		list.add("Sagar");
		SortUtility<String> util = new SortUtilityStringImpl();
		System.out.println(list);
		/*
		 * System.out.println(util.sort(list));
		 * 
		 * System.out.println( ( new SortUtility<String>() {
		 * 
		 * @Override public List<String> sort(List<String> input) {
		 * Collections.sort(input); return input; } } ).sort(list) );
		 */

		LambdaRunner(list, input -> {
			System.out.println(input.indexOf("Ritesh"));
			return input;
		});
		System.out.println(list);
		LambdaRunner(list, input -> {
			Collections.sort(input);
			System.out.println(input.indexOf("Ritesh"));
			return input;
		});
		System.out.println(list);
	}

	public static <T> void LambdaRunner(List<T> list, SortUtility<T> util) {
		util.sort(list);
	}
}
