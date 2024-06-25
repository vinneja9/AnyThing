package Bak;

import java.io.*;

import java.util.Arrays;

public class bak1546 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int length = Integer.parseInt(br.readLine());
        String arr[] = br.readLine().split(" ");
        double arrRe[] = new double[length];
        for (int i = 0; i < length; ++i) {
            arrRe[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(arrRe);
        double finalVal = 0;
        for (int i = 0; i < length; ++i) {
            finalVal = finalVal + arrRe[i];
        }
        finalVal = 100 * finalVal / arrRe[length - 1];
        System.out.println(finalVal / length);
    }
}
