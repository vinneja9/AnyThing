package Bak;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//부루탈포스 그냥 모든거 대입하는거 함
public class bak7568 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int length = Integer.parseInt(br.readLine());
        String arr[] = new String[length];
        for (int i = 0; i < length; i++) {
            arr[i] = br.readLine();
        }
        for (int i = 0; i < length; i++) {
            int W = Integer.parseInt(arr[i].split(" ")[0]);
            int H = Integer.parseInt(arr[i].split(" ")[1]);
            int count = 1;
            for (int j = 0; j < length; j++) {
                int WF = Integer.parseInt(arr[j].split(" ")[0]);
                int HF = Integer.parseInt(arr[j].split(" ")[1]);
                if (j == i) {
                    continue;
                }
                if (W < WF && H < HF) {
                    count++;
                }
            }
            System.out.print(count + " ");
        }
    }
}
