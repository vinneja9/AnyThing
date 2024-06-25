package School.ch2024FirstOTT;

class Circle {
	double radius;
	static int num1 = 0;
	int num2 = 0;

	public Circle(double radius) {
		this.radius = radius;
		num1++;
		num2++;
	}
}

public class CircleDemo {
	public static void main(String[] args) {
		Circle Circle1 = new Circle(10.0);
		Circle Circle2 = new Circle(5.0);

		// print()
		System.out.println("원의 개수 : " + Circle1.num1);
		System.out.println("원의 개수 : " + Circle2.num2);

	}

	void print() {
		System.out.println("인스턴스 메서드");
	}

}