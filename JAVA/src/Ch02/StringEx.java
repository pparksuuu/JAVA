package Ch02;

public class StringEx {
	public static void main(String[] args) {
		String name = "Ja" + "va";
		String str = name + 8.0; // String + any type -> String
		
		System.out.println(name);
		System.out.println(str);
		System.out.println(7 + " ");
		System.out.println(" " + 7);
		System.out.println(7 + "");
		System.out.println("" + 7);
		System.out.println("" + "");
		System.out.println(7 + 7 + "");
		System.out.println("" + 7 + 7);
	}
}
