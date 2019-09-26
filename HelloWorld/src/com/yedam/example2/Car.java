package com.yedam.example2;

import com.yedam.example.Tire;

public class Car {
	Tire[] t1 = { new Tire("앞왼쪽", 6), new Tire("앞오른쪽", 2), new Tire("뒤왼쪽", 3), new Tire("뒤오른쪽", 4) };

	int run() {
		System.out.println("[자동차가 달립니다.]");
		for (int i = 0; i < t1.length; i++) {
			if (t1[i].roll() == false) {
				stop();
				return i + 1;
			} 
//		}
//	if (t1[0].roll()==false) {
//		stop();
//		return 1;
//	} else if (t1[1].roll()==false) {
//		stop();
//		return 2;
//	} else if (t1[2].roll()==false) {
//		stop();
//		return 3;
//	} else if (t1[3].roll()==false) {
//		stop();
//		return 4;
		}
		return 0;
	}

	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
