package hello;

public class IfExample {
 public static void main(String[] args) {
	int a = 90;
	if(a>50 && a>100) { // && (and) || (or)
		System.out.println("50이상.");
	    System.out.println("좋은 점수네요.");
	}else 
	{
		System.out.println("그외의 경우.");
	}
	if(a>100) 
	{
		System.out.println("만점입니다.");
	}
}
}
