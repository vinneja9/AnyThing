package Bak;

import java.io.*;

public class bak1259 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                break;
            }
            solve(num);
        }

    }

    public static void solve(int num) throws IOException {
        String ans = "yes";
        String val = String.valueOf(num);
        int start = 0;
        int end = val.length() - 1;
        while (start <= end) {
            if (val.charAt(start) != val.charAt(end)) {
                ans = "no";
                break;
            }
            start++;
            end--;
        }
        System.out.println(ans);
    }

}