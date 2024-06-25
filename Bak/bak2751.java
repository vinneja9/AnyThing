package Bak;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bak2751 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int length = Integer.parseInt(br.readLine());
        int arr[] = new int[length];
        int count[] = new int[2000001];
        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < length; i++) {
            count[arr[i] + 1000000]++;
        }
        for (int i = 0; i < 2000001; i++) {
            if (count[i] != 0) {
                bw.write(String.valueOf(i - 1000000));
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}
