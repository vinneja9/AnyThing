package Bak;

import java.io.*;

public class bak11050 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String arr[] = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);
        int nP = 1;
        int kP = 1;
        int nMk = n - k;
        int nMkP = 1;

        for (int i = 1; i <= n; ++i) {
            nP *= i;
        }
        for (int i = 1; i <= k; ++i) {
            kP *= i;
        }
        for (int i = 1; i <= nMk; ++i) {
            nMkP *= i;
        }
        System.out.println(nP / (kP * nMkP));
    }
}
