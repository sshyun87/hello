package hello;

public class ForAndForExample {
	public static void main(String[] args) {
		int i = 2;
		while (i < 10) {
			System.out.println("**"+i+"단**");
			int j = 1;
			while (j < 10) {
				System.out.println(i + "*" + j + "=" + (i * j));
				j++;
			}
			i++;
			}
	}
}