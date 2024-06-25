package School.ch2023SecondComputerPro.ch12;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account2 {
    public static void main(String[] args) {

        double total, rate, month, money;
        int cnt;

        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###");

        System.out.println("--------------------------------");
        System.out.println("    단리 / 복리 이자 계산 프로그램");
        System.out.println("--------------------------------");

        while (true) {
            System.out.print("원금 : ");
            money = in.nextInt();

            System.out.print("이자율 : ");
            rate = in.nextDouble();

            System.out.print("기간(월) : ");
            month = in.nextInt();

            System.out.println("--------------------------------");
            System.out.println("1.월단위 단리  2.월단위 복리  0.종료 ");
            System.out.print("번호 선택 ( 1, 2, 0 ) :  ");
            cnt = in.nextInt();

            switch (cnt) {
                case 1:
                    total = (money * rate * month) + money;
                    break;
                case 2:
                    total = money * Math.pow(1 + rate, month);
                    break;
                case 0:
                    System.exit(0);
                default:
                    total = 0;
            }
            String totalDF = df.format(total);
            System.out.println("================================");
            System.out.println(">>원금+이자 = " + totalDF + "원");
            System.out.println("================================");
        }
    }
}
