package hello;

public class ArrayExample2 {
	public static void main(String[] args) {
		int[][] intAry = { { 2, 3, 4 }, { 5, 6, 7 } };
		for (int i = 0; i < intAry.length; i++) {
			for (int j = 0; j < intAry[i].length; j++) {
				System.out.print("["+i+","+j+"=>"+intAry[i][j]+"]");
			}
			System.out.println();
		}
	}

}
