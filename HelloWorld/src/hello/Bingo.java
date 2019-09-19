package hello;

public class Bingo {
	public static void main(String[] args) {
		int[][] intAry = new int[5][5];
//		intAry = new int[][] {{1,2,3,4,5},{6,7,8,9,10},
//		  {11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};for(
//     	int i = 0;i<intAry.length;i++)
//	    {
//	    for(int j = 0; j<intAry[i].length; j++) {
//  		System.out.print("["+i+","+j+"=>"+intAry[i][j]+"]");
//  		 }
// 		 System.out.println();
		int a = 1;
		for (int i = 0; i < intAry.length; i++) {
			for (int j = 0; j < intAry[i].length; j++) {
				intAry[i][j] = a++;
				}
			}
		for (int j = 4; j < intAry[i].length; j++) {
		   for (int i = 0; i < intAry.length; i++) {
			
				System.out.print(intAry[i][j]+" ");
				}
			System.out.println();  
		} 
		                                                                                                                                                                                                          
	}
	

}


