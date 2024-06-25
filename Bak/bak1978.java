package Bak;

import java.io.*;

public class bak1978 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = new String[Integer.parseInt(br.readLine())];
        num = br.readLine().split(" ");

        int val = 0;
        int sw = 0;
        for (int i = 0; i < num.length; ++i) {
            if (Integer.parseInt(num[i]) == 1) {
                continue;
            } else if (Integer.parseInt(num[i]) == 2) {
                ++val;
                continue;
            } else {
                for (int j = Short.parseShort(num[i]) - 1; 2 <= j; --j) {
                    if (Short.parseShort(num[i]) % j == 0) {
                        sw = 0;
                        break;
                    } else {
                        sw = 1;
                    }

                }
                val = val + sw;
            }
        }
        System.out.println(val);
    }
}
