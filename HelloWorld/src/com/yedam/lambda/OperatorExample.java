package com.yedam.lambda;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	static int[] scores = {92,95,87};
	
	static int minOrMax(IntBinaryOperator oper) {
		int result = scores[0]; 
		for(int score : scores) {
			result = oper.applyAsInt(result, score);
		}
		return result;
	}
	public static void main(String[] args) {
		IntBinaryOperator oper = (a, b) -> {
			int result = 0;
				result = (a >= b ? a : b);
				return result;
			};
		int result = minOrMax(oper);
		System.out.println("max: " + result);
		result = minOrMax((a,b)->{
			int res = Integer.MAX_VALUE;
			res = (a>=b? b :a);
			return (a>=b? b : a);
		});
		System.out.println("min: " + result);
	}
}
