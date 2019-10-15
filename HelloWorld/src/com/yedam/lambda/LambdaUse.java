package com.yedam.lambda;

public class LambdaUse {
	
	//정적 메소드 1, 2
	oper = (x,y) -> {
		return Calculator.staticSum(x, y);
	}; // static메소드1
	result = oper.applyAsInt(a, b);
	System.out.println("정적메소드참조1: "+result);
	
	oper = Calculator::staticSum;//static메소드2
	result = 
	}
	
	//인스턴스메소드 1,2
	oper = (x,y)->{
		return cal.instanceSum(x,y);
	};//instance 메소드 1.
	
	
	

}
