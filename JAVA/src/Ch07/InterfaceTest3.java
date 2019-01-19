package Ch07;

public class InterfaceTest3 {
	public static void main(String[] args) {
		A3 a = new A3();
		a.methodA3();
	}
}

class A3 {
	void methodA3() {
		// 제 3의 클래스의 메서드를 통해서 인터페이스 I를 구현한 클래스의 인스턴스를 얻어온다
		I3 i = InstanceManager.getInstance(); 
		i.methodB3();
		System.out.println(i.toString());
	}
}

interface I3 {
	public abstract void methodB3();
}

class B3 implements I3 {
	public void methodB3() {
		System.out.println("methodB3 in B3 class");
	}
	
	public String toString() { return "class B3";}
}

class InstanceManager {
	public static I3 getInstance() {
		return new B3(); // 다른 인스턴스로 변경하려면 여기만 바꾸면 됨!
	}
}