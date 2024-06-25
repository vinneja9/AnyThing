package Bak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bak2609 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int arr[] = new int[2];
        int j = 0;
        for (String i : br.readLine().split(" ")) {
            arr[j] = Integer.parseInt(i);
            ++j;
        }
        System.out.println(uclid(arr[0], arr[1]));
        System.out.println((arr[0] * arr[1]) / (uclid(arr[0], arr[1])));
    }

    public static int uclid(int a, int b) {
        int A;
        int B;

        if (a >= b) {
            A = a;
            B = b;
        } else {
            A = b;
            B = a;
        }
        if (A % B == 0) {
            return B;
        }
        return uclid(B, A % B);
    }
}
