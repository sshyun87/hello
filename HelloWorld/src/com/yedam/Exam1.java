package com.yedam;

public class Exam1 {
	public static void main(String[] args) {
		int max = 0;
		for (int i = 21; i < 200; i++) {
			if (i % 3 == 0 && i % 7 == 0) {
				max = i;
			}
		}
		System.out.println("3과 7의 공통배수 중 200보다 작지만 가장 큰 수 는"+max+"입니다.");
	}
}
