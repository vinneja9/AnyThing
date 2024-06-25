package School.ch2024FirstDataStructure.etc;

import java.io.*;

class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object obj1) {
        Point obj = (Point) obj1;
        if (obj.x == this.x && obj.y == this.y) {
            return (true);
        } else {
            return (false);
        }

    }
}

public class equals {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x1 = Integer.parseInt(br.readLine());
        int y1 = Integer.parseInt(br.readLine());
        int x2 = Integer.parseInt(br.readLine());
        int y2 = Integer.parseInt(br.readLine());

        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);

        System.out.println(point1.equals(point2));
    }
}
