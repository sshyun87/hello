package hello;

import java.util.Scanner;

public class GetMaxValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] intAry = new int [5];
		for (int i = 0; i <intAry.length; i++) {
		System.out.println("정수 값을 입력하세요.");
		intAry[i] = sc.nextInt();
	}
	int maxValue = 0;	
	for(int i=0; i<intAry.length; i++) {
		if(maxValue < intAry[i])
		   maxValue = intAry[i];
//maxValue = (maxValue > intAry[i] ? maxValue : intAry[i]);
		}
	System.out.println("제일 큰값은: "+maxValue);
	
		
	}

}
