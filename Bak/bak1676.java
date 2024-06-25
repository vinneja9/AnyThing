package Bak;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bak1676 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    // 5가 들어있을때마다 0이 늘어남으로 약수 5의 갯수를 count
    public static void main(String[] args) throws IOException {
        int count = 0;
        int num = Integer.parseInt(br.readLine());
        for (int i = 1; i <= num; i++) {
            int divNum = i;
            while (divNum % 5 == 0) {
                count++;
                divNum = divNum / 5;
            }
        }
        System.out.println(count);
    }
}
