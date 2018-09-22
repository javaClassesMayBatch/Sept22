package com.java.demo.lambdaDemo2;

import java.util.List;

public interface SortUtility<T> {
	public List<T> sort(List<T> input);
}
