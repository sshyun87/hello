package classes;

public class CarExample {
	public static void main(String[] args) {
		
		Car car1 = new Car();//new를 사용해 실체/객체(인스턴스)를 만들어야 한다.
		car1.model="그랜저";
		car1.color="red";
		car1.price=10000;
		car1.maxSpeed=200;
		
//		System.out.println(car1.model);
//		System.out.println(car1.color);
//		System.out.println(car1.price);
//		System.out.println(car1.maxSpeed);
//		car.drive();
		
		Car car2 = new Car();
		int[] intAry =new int[5];
		Car[] carAry = new Car[2];
		String[] strAry = null;
		
		car2.model = "소나타";
		car2.color = "Black";
		car2.price = 1500;
		car2.maxSpeed = 250;
//		car2.drive();
		
		carAry[0] = car;
		carAry[1] = car2;
		
		for(Car c: carAry) {
			System.out.println();
		}
		
		
	}

}
