package Bak;

import java.io.*;

public class bak2292 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int fristnum = Integer.parseInt(br.readLine());
        int start = 2;
        int end = 7;
        int num = 2;
        while (true) {
            if (fristnum == 1) {
                System.out.println("1");
                break;
            }
            if (fristnum >= start && fristnum <= end) {
                System.out.println(num);
                break;
            } else {
                start = start + 6 * (num - 1);
                end = end + 6 * (num);
                num++;
            }
        }

    }
}
