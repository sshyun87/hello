package com.yedam.example;

public class HankookTire extends Tire {
	HankookTire(String location, int maxRotation){
		super(location, maxRotation);
	}

	@Override
	boolean roll() {
		if(maxRotation>accumulatedRotation) {
			System.out.println(location + " Hankook 타이어 수명: " 
		               + (maxRotation-accumulatedRotation) + " 회");
			return true;
		}else {
			System.out.println("***" + location + "Hankook 타이어 펑크***");
			return false;
		
	}
	}
}


