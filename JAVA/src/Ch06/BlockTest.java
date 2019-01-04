package Ch06;

public class BlockTest {
	static {
		System.out.println("static {} ------ 클래스 초기화 블럭입니다.");
	}
	
	{
		System.out.println("{} ------ 인스턴스 초기화 블럭입니다.");
	}
	
	public BlockTest() {
		System.out.println("BlockTest 클래스의 생성자입니다.");
	}
	
	public static void main(String[] args) {
		System.out.println("BlockTest bt = new BlockTest(); ");
		BlockTest bt = new BlockTest();
		
		System.out.println("BlockTest bt2 = new BlockTest(); ");
		BlockTest bt2 = new BlockTest();
	}
}
