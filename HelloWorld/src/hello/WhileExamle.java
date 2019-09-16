package hello;

public class WhileExamle {
	public static void main(String[] args) {
		// 4단 출력
		int i = 1;
		int k = 4;
		while (true) {
			i++;
			System.out.println(k + "*" + i + "=" + (k * i));
			if (i == 23)
				break;
		}

	}

}
