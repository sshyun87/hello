package com.yedam.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LindkedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		long startTime, endTime;
		System.out.println("ArrayList");
		startTime = System.nanoTime();
		for(int i=0; i<100000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("걸린시간은: "+ (endTime - startTime));
		System.out.println("LinkedList");
		startTime = System.nanoTime();
		for(int i=0; i<100000; i++) {
			list2.add(0, String.valueOf(i));
	}
		endTime = System.nanoTime();
		System.out.println("걸린시간은: "+ (endTime - startTime));
	}
}
