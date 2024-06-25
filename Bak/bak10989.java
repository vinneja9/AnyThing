package Bak;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//bak 10989번 카운팅 정렬, 퀵정렬
public class bak10989 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int length = Integer.parseInt(br.readLine());
        int ary[] = new int[length];

        for (int i = 0; i < length; i++) {
            ary[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < length; i++) {
            bw.write(String.valueOf(ary[i]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    public void counting() throws IOException {
        int length = Integer.parseInt(br.readLine());
        int ary[] = new int[length];
        int counting[] = new int[10001];
        for (int i = 0; i < length; i++) {
            ary[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < length; i++) {
            counting[ary[i]]++;
        }
    }

}