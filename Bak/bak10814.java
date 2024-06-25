package Bak;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bak10814 {
    // 사용 알고리즘 : 카운팅정렬, 2024-1 자료구조 카운팅 정렬 응용(원래 뒤부터 채우는건데, 앞으로 돌아가게 만듬)
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        // 이름 나이를 한번에 받고
        // count 조지고
        // 위치를 알고 spite(" ")[1] 위치에 배치

        int length = Integer.parseInt(br.readLine());
        String arr[] = new String[length];
        String arr2[] = new String[length];
        int count[] = new int[201];
        int beging[] = new int[201];
        for (int i = 0; i < length; i++) {
            arr[i] = br.readLine();
        }
        for (int i = 0; i < length; i++) {
            count[Integer.parseInt(arr[i].split(" ")[0])]++;
        }
        for (int i = 1; i < 201; i++) {
            beging[i] = beging[i - 1] + count[i - 1];
        }
        for (int i = 0; i < length; i++) {
            int val = Integer.parseInt(arr[i].split(" ")[0]);
            arr2[beging[val]] = arr[i];
            beging[val]++;

        }
        for (int i = 0; i < length; i++) {
            System.out.println(arr2[i]);

        }
    }
}
