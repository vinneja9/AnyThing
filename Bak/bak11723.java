package Bak;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// bak11723 비트마스킹 사용
public class bak11723 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static int S = 0;

    public static void main(String[] args) throws IOException {
        int run = Integer.parseInt(br.readLine());
        for (int i = 1; i <= run; i++) {
            String fullCommand = br.readLine();
            String command = fullCommand.split(" ")[0];
            int number = 0;
            // all함수 empty함수시 스필릿 [1]이 작동안하므로 적용부탁
            // 둘중 하나라도 참이면, 작동 안되게 만들기

            switch (command) {
                case "add": {
                    number = Integer.parseInt(fullCommand.split(" ")[1]);
                    S = S | (1 << number);
                    break;
                }
                case "remove": {
                    number = Integer.parseInt(fullCommand.split(" ")[1]);
                    S = S & ~(1 << number);
                    break;
                }
                case "check": {
                    number = Integer.parseInt(fullCommand.split(" ")[1]);
                    if (0 < (S & (1 << number))) {
                        bw.write(1 + "\n");
                    } else {
                        bw.write(0 + "\n");
                    }

                    break;
                }
                case "toggle": {
                    number = Integer.parseInt(fullCommand.split(" ")[1]);
                    S = S ^ (1 << number);
                    break;
                }
                case "all": {
                    S = 2097150;
                    break;
                }
                case "empty": {
                    S = 0;
                    break;
                }
            }

        }
        bw.flush();
    }

    public static void add(int i) {
        S = S | (1 << i);
    }

    public static void remove(int i) {
        S = S & ~(1 << i);
    }

    public static void check(int i) throws IOException {
        if (0 < (S & (1 << i))) {
            bw.write(String.valueOf(1));
        } else {
            bw.write(String.valueOf(0));
        }
        bw.flush();

    }

    public static void toggle(int i) {
        S = S ^ (1 << i);

    }

    public static void all() {
        S = 2097150;
    }

    public static void empty() {
        S = 0;

    }

}
