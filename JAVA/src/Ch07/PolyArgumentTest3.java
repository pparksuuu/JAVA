package Ch07;

import java.util.Vector;

class Product3 {
	int price;
	int bonusPoint;
	
	Product3 (int price) {
		this.price = price;
		bonusPoint = (int) (price/10.0);
	}
	
	Product3 () {
		price = 0;
		bonusPoint = 0;
	}
}

class Tv3 extends Product3
{
	Tv3() { super(100); }
	public String toString() { return "Tv3"; }
}

class Computer3 extends Product3 {
	Computer3() { super(200); }
	public String toString() { return "Computer3"; }
}

class Audio3 extends Product3 {
	Audio3() { super(50); }
	public String toString() { return "Audio3"; }
}

class Buyer3 {
	int money = 1000;
	int bonusPoint = 0;
	Vector item = new Vector(); // 구입한 제품을 저장하는데 사용될 Vector 객체
	
	void buy (Product3 p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p + "을/를 구입하셨습니다.");
	}
	
	void refund (Product3 p) {
		if (item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "을/를 반품하셨습니다.");
		} else {
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		if (item.isEmpty()) {
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		
		for (int i = 0; i < item.size(); i++) {
			Product3 p = (Product3) item.get(i);
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p;
		}
		
		System.out.println("구입하신 물품의 총 금액은 " + sum + "만원 입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}

public class PolyArgumentTest3 {
	public static void main(String[] args) {
		Buyer3 b = new Buyer3();
		Tv3 tv = new Tv3();
		Computer3 com = new Computer3();
		Audio3 audio = new Audio3();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();
	}
}
