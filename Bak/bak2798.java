package Bak;

import java.io.*;
import java.util.*;

public class bak2798 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int maxNum = Integer.parseInt(br.readLine().split(" ")[1]);
        String numAry[] = br.readLine().split(" ");
        int finalVal = 0;
        // 낮은거에서 높은걸로 소트
        Arrays.sort(numAry);
        for (int i = 2; i < numAry.length; ++i) {
            for (int j = 1; j < i; ++j) {
                for (int q = 0; q < j; ++q) {
                    int currentVal = Integer.parseInt(numAry[q]) + Integer.parseInt(numAry[j])
                            + Integer.parseInt(numAry[i]);
                    if (q == j - 1 && j == i - 1 && currentVal > maxNum) {
                        break;
                    }
                    if (currentVal >= finalVal && currentVal <= maxNum) {
                        finalVal = currentVal;
                    }
                }
            }
        }
        System.out.println(finalVal);
    }
}
