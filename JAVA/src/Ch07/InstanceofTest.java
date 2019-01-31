package Ch07;

public class InstanceofTest {
	public static void main(String[] args) {
		FireEngine5 fe = new FireEngine5();
		
		if (fe instanceof FireEngine5) {
			System.out.println("This is a FireEngine instance");
		}
		
		if (fe instanceof Car5) {
			System.out.println("This is a Car instance");
		}
		
		if (fe instanceof Object) {
			System.out.println("This is an Object instance");
		}
		
		System.out.println(fe.getClass().getName());
	}
}

class Car5 {}
class FireEngine5 extends Car5 {}
