package School.ch2024FirstOTT;

import java.io.*;

public class mathmatc {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("1.( + ) 2.( - ) 3.( * ) 4.( / )");
        int math = Integer.parseInt(br.readLine());
        System.out.println("첫번째 숫자를 입력하세요");
        int num1 = Integer.parseInt(br.readLine());
        System.out.println("두번째 숫자를 입력하세요");
        int num2 = Integer.parseInt(br.readLine());
        Curcul ma = new Curcul();
        switch (math) {
            case 1:
                System.out.println(ma.add(num1, num2));
                break;
            case 2:
                System.out.println(ma.minuse(num1, num2));
                break;
            case 3:
                System.out.println(ma.mult(num1, num2));
                break;
            case 4:
                System.out.println(ma.div(num1, num2));
                break;
        }

    }
}

class Curcul {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int minuse(int num1, int num2) {
        return num1 - num2;
    }

    public int mult(int num1, int num2) {
        return num1 * num2;
    }

    public int div(int num1, int num2) {
        return num1 / num2;
    }
}
