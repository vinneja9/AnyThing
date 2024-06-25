package Bak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class bak1874 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static Stack<Integer> st = new Stack<Integer>();

    public static void main(String[] args) throws IOException {
        int nextNum = 1;
        int a = Integer.parseInt(br.readLine());
        for (int i = a; i > 0; --i) {
            int matchNum = Integer.parseInt(br.readLine());
            while (nextNum <= matchNum) {
                st.push(nextNum);
                nextNum++;
                sb.append("+").append('\n');
            }
            if (st.peek() == matchNum) {
                st.pop();
                sb.append("-").append('\n');
            } else {
                System.out.println("NO");
                System.exit(0);
            }
        }
        System.out.println(sb);
    }
}
