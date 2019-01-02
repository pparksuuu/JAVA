package Ch02;

public class VarEx1 {
	public static void main(String[] args) {
		String str = "The greatest victory is that which requires no battle";
		String[] line = str.split(" ");
		String reverseLine = "";
		System.out.println(line[0]);
		for (int i = line.length - 1; i >= 0; i--) {
			if (i == 0) {
				reverseLine += line[0];
			} else {
				reverseLine += (line[i] + " ");
			}
		}
		System.out.println(reverseLine);
	}
}
