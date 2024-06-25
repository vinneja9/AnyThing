package Bak;

import java.io.*;

public class bak2748 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        long num = Integer.parseInt(br.readLine());
        long fNum = 0;
        long sNum = 1;
        if (num == 0) {
            System.out.println(fNum);
        } else if (num == 1) {
            System.out.println(sNum);
        } else {
            for (int i = 0; i < num - 1; ++i) {
                if (i % 2 == 0) {
                    fNum = fNum + sNum;
                } else {
                    sNum = fNum + sNum;
                }

            }
            if (fNum >= sNum) {
                System.out.println(fNum);
            } else {
                System.out.println(sNum);
            }

        }

    }
    // 첫번째 방법, 이건 그냥 하드코딩했어.//

    public static void Second(String[] args) throws IOException {
        int numLenght = Integer.parseInt(br.readLine());
        long numArr[] = new long[numLenght + 1];
        numArr[0] = 0;
        numArr[1] = 1;
        for (int i = 2; i <= numLenght; ++i) {
            numArr[i] = numArr[i - 1] + numArr[i - 2];
        }
        System.out.println(numArr[numLenght]);

    }
    // 두번쨰 방법, 이게더 짧아.//
}
