package Ch06;

class Tv {
	// Tv의 속성(멤버변수)
	String color; // 색상
	boolean power; // 전원상태
	int channel;
	
	// Tv의 기능(메서드)
	void power() {power = !power; } // TV를 켜거나 끄는 기능을 하는 메서드
	void channelUp() { ++channel; } // TV의 채널을 높이는 기능을 하는 메서드
	void channelDown() { --channel; } // TV의 채널을 낮추는 기능을 하는 메서드
}

public class TvTest {
	public static void main(String[] args) {
		Tv t; // Tv 인스턴스를 참조하기 위한 변수 t를 선언.(reference 변수)
		t = new Tv(); //Tv의 인스턴스 생성.
		t.channel = 27; // Tv 인스턴스의 멤버변수 channel의 값을 27로 한다.
		t.channelDown(); // Tv 인스턴스의 메서드 channelDown()을 호출한다.
		System.out.println("현재 채널은 " + t.channel + "입니다.");
	}
}
