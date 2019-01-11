package Ch07;

public class CastingTest {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
//		car.water(); // 컴파일 에러!! Car타입의 참조변수로는 water() 호출 불가능!
		fe2 = (FireEngine) car; // 자손타입 <- 조상타입. Down Casting
		fe2.water();
	}
}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brr~~~");
	}
	
	void stop() {
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water!!");
	}
}
