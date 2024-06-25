package School.ch2024FirstOTT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class LottoEx2 {
	public static void main(String[] args) {
		System.out.println("----------------------------");
		System.out.print("Lotto 구입 개수(자동): ");

		Scanner sc = new Scanner(System.in);
		int inNumber = sc.nextInt();
		System.out.println("----------------------------");

		for (int i = 0; i < inNumber; i++) {
			System.out.println(i + 1 + " " + outNumber());
		}
		sc.close();
	}

	static String outNumber() {
		Set<Integer> a = new HashSet<Integer>();

		while (a.size() != 6) {
			a.add((int) (Math.random() * 45 + 1));
		}

		List<Integer> b = new ArrayList<Integer>(a);

		Collections.sort(b);
		return b.toString();
	}
}