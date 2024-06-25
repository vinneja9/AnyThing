package School.ch2024FirstOTT;

class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    double circleArea() {
        return 3.14 * radius * radius;
    }

}

public class InstanceClassEx2 {
    static int num = 1;

    public static void main(String[] args) {
        Circle[] cc = new Circle[5];

        for (int i = 0; i < cc.length; i++) {
            cc[i] = new Circle(i + num);
            System.out.printf("원의 넓이(Radius: %.1f) = %.2f\n",
                    cc[i].radius, cc[i].circleArea());
            System.out.println("----------------------------");
        }
    }
}
