package Bak;

import java.io.*;

public class bak2869 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String arr[] = br.readLine().split(" ");
        int A = Integer.parseInt(arr[0]);
        int B = Integer.parseInt(arr[1]);
        int V = Integer.parseInt(arr[2]);
        if (A > V) {
            bw.write(1);
        } else {
            if ((V - A) % (A - B) == 0) {
                bw.write(String.valueOf((V - A) / (A - B) + 1));
            } else {
                bw.write(String.valueOf((V - A) / (A - B) + 2));
            }
        }

        bw.flush();
        bw.close();

    }
}