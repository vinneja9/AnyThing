package School.ch2023SecondComputerPro.ch12;

import java.text.DecimalFormat;
import java.util.Scanner;

class IRate {

	public double interest(int x, double y, int z) {
		return (x * Math.pow((1 + y / 12), z));
		// 이자가 한달에 한번씩 붙는다 가정하였기 때문에 12로 나누고 12개월씩 받는다 가정함//
	}
}

public class Account {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IRate ir = new IRate();
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.print("원금: ");
		int money = sc.nextInt();
		System.out.print("이자율: ");
		double rate = sc.nextDouble();
		System.out.print("기간(월): ");
		int month = sc.nextInt();

		System.out.println(">>원금+이자 =" + df.format(ir.interest(money, rate, month)) + "원");
	}
}
