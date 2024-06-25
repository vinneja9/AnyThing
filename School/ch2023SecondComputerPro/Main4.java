package School.ch2023SecondComputerPro;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        System.out.println("<<정수를 10개 입력하시오>>");
        for (int i = 0; i < 10; ++i) {
            int input = sc.nextInt();
            if (input >= 0) {
                for (int j = 9; j >= 0; --j) {
                    if (input >= (j * 10)) {
                        array[j] += 1;
                        break;
                    }
                }
            }

        }
        for (int k = 0; k < 10; ++k) {
            System.out.printf("%2d ~ %2d : ", (k * 10), (k * 10 + 9));
            for (int l = 0; l < array[k]; ++l) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
// 과제//