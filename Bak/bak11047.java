package Bak;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bak11047 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String resive[] = br.readLine().split(" ");
        int money = Integer.parseInt(resive[1]);
        int count = 0;
        int[] coin = new int[Integer.parseInt(resive[0])];

        for (int i = 0; i < Integer.parseInt(resive[0]); ++i) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        while (money != 0) {
            for (int i = Integer.parseInt(resive[0]) - 1; 0 <= i; --i) {
                while (money >= coin[i]) {
                    money = money - coin[i];
                    count++;
                }
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
