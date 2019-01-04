package Ch06;

class Car3 {
	String color;
	String gearType;
	int door;
	
	Car3() {
		this("white", "auto", 4);
	}
	
	Car3(Car3 c) {
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	
	Car3(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class CarTest3 {
	public static void main(String[] args) {
		Car3 c1 = new Car3();
		Car3 c2 = new Car3(c1); // c1의 복사본 c2를 생성
		
		System.out.printf("c1의 color = %s, gearType = %s, door = %d \n", c1.color, c1.gearType, c1.door);
		System.out.printf("c2의 color = %s, gearType = %s, door = %d \n", c2.color, c2.gearType, c2.door);
		
		c1.door = 100; // c1의 인스턴스 변수 door의 값을 변경한다.
		System.out.println("c1.door=100; 수행 후");
		System.out.printf("c1의 color = %s, gearType = %s, door = %d \n", c1.color, c1.gearType, c1.door);
		System.out.printf("c2의 color = %s, gearType = %s, door = %d \n", c2.color, c2.gearType, c2.door);
	}
}
