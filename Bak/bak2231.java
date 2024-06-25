package Bak;

import java.io.*;

public class bak2231 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int fristVal = Integer.parseInt(br.readLine());
        solve(fristVal);

    }

    public static void solve(int num) throws IOException {
        @SuppressWarnings("unused")
        int length = String.valueOf(num).length();
        int val = 0;
        int finalval = 0;
        for (int j = 0; j <= num; ++j) {
            finalval = val;
            for (int i = 0; i < (String.valueOf(val).length()); i++) {
                finalval = finalval + Character.getNumericValue(String.valueOf(val).charAt(i));
            }
            if (finalval == num) {
                System.out.println(val);
                break;
            }
            if (val == num) {
                System.out.println("0");
            }
            ++val;
        }
    }
}
