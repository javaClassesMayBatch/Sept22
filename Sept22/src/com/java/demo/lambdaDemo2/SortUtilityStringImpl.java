package com.java.demo.lambdaDemo2;

import java.util.Collections;
import java.util.List;

public class SortUtilityStringImpl implements SortUtility<String>{

	@Override
	public List<String> sort(List<String> input) {
		Collections.sort(input);
		return input;
	}

}
