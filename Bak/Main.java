package Bak;

import java.io.*;
import java.util.*;

public class Main {
    // 해쉬맵을 이용한 어쩌구
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int i;

    public static void main(String[] args) throws IOException {
        int lenght = Integer.parseInt(br.readLine());
        int[] arr = new int[lenght];
        int[] arr2 = new int[lenght];
        int plus = 0;

        arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);
        arr2[0] = Integer.parseInt(br.readLine());
        for (int i = 1; i < lenght; ++i) {
            arr2[i] = Integer.parseInt(br.readLine()) + arr[i - 1];
        }
        for (int i = 0; i < lenght; ++i) {
            plus = plus + arr2[i];
        }

        bw.write(String.valueOf(plus));
    }
}