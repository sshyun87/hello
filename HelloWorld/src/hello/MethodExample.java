package hello;

public class MethodExample {
	public static void main(String[] args) {
		System.out.println(args[0]);
		showName();
		showAge(28);
		showMe(175.5, 65.5);
		int result = sum(4,5);
		    result = minus(4,5);
		    result = multi(4,5);
		double result1 = div(10,5);
		System.out.println("결과값: "+result1);
		System.out.println(args[1]);
	}
	
		
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static int minus(int a, int b) {
		return a-b;
	}
	
	public static int multi(int a, int b) {
		return a*b;
	}
	
	public static double div(int a, int b) {
		return a/b;
	}
	
	public static void showMe(double height, double weight) {
		System.out.println("I am "+height+" cm and "+weight+" kg");
	}
	
	public static void showAge(int age) {
		System.out.println("I am "+age+" years old.");
	}
    
	public static void showName() {
		System.out.println("Hello, my name is Sihyun.");
	}
}
