package hello;

public class MethodExample33 {
	public static void main(String[] args) {
//		int[] intAry = {1,2,3,4,5};
//		int sum = 0;
//		sum = sumArray(intAry);
//		System.out.println("합은: " + sum);
//		
		 printStar(5);
	}
//	public static void printStar(int a) {
//		for (int i= 0; i<a; i++) {
//			for (int j=0; j<a; j++){
//		System.out.print("*");
//			}
//			System.out.println();
	
	public static void printStar(int a) {
		for (int i = 1; i<=a; i++) {
			for(int j = 5; j>=i ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}	
		int[] ary = showArray(1,2,3,4,5);
		for (int i = 0; i<ary.length; i++) {
			System.out.println(ary[i]);
		}// = 
		for(int a :ary) {    //데이터 갯수를 알 경우 사용 가능.
			System.out.println(a);
		}
		
	
//     public static int[] showArray(int a, int b, int c, int d, int e) {
//    	 int[] ary = {a*2, b*2, c*2, d*2, e*2};
//    	 return ary;
//}
//	    
//	        int[] intAry2 = {1,2,3,4,5};
//	    
//	public static int sumArray(int[] ary) {
//		int sum = 0;
//		for(int i=0; i<ary.length; i++) {
//			sum = sum + ary[i];
	}
}

	


