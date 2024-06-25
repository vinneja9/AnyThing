package Bak;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class bak1181 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int length = Integer.parseInt(br.readLine());
        String[] arr = new String[length];

        for (int i = 0; i < length; i++) {
            arr[i] = br.readLine();
        }

        // sort를 나만의 방식대로 만들기
        // compare를 override해서 하기
        // 비교해서 양수나오면 앞뒤 바꾸기
        // 음수, 0 나오면 그냥 가기
        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                } else {
                    return s1.length() - s2.length();
                }
            }
        });
        System.out.println(arr[0]);
        for (int i = 1; i < length; i++) {
            if (!arr[i].equals(arr[i - 1])) {
                System.out.println(arr[i]);
            }
        }

    }
}
