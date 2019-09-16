package hello;

public class Test {
	public static void main(String[] args) {
	int sum = 0;
	int a = 1, b = 10;
	for (int i=a; i <= b; i++) {
		if (i % 2 == 1)
		sum += i;
	}
    System.out.println("1에서 "+"10까지의 합은"+sum);
    
	}
}



