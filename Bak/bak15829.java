package Bak;

import java.io.*;

public class bak15829 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        @SuppressWarnings("unused")
        long length = Integer.parseInt(br.readLine());
        char arr[] = br.readLine().toCharArray();
        long finalVal = 0;
        long pow = 1;
        // arr에 있는거 순서대로 아스키로 전환하고 제곱//
        for (int i = 0; i < arr.length; ++i) {

            finalVal = (finalVal + pow * (((int) arr[i] - 96) % 1234567891));
            pow = (pow * 31) % 1234567891;

        }
        System.out.println(finalVal % 1234567891);
    }
}
