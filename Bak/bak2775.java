package Bak;

import java.io.*;

//bak2775 부녀회장
public class bak2775 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        for (int i = Integer.parseInt(br.readLine()); 0 < i; i--) {
            int arr[] = new int[2];
            arr[0] = Integer.parseInt(br.readLine());
            arr[1] = Integer.parseInt(br.readLine());
            System.out.println(person(arr[0], arr[1]));
        }
    }

    private static int person(int a, int b) {
        // 0층의 인원을 물어보면, b(해당 호수)를 return
        if (a == 0) {
            return b;
        }
        // 0층에 인원을 넣기
        int ary[][] = new int[a + 1][b];
        for (int i = 0; i < ary[0].length; i++) {
            ary[0][i] = i + 1;
        }
        // 각 1호마다 1명 넣기
        for (int i = 1; i < ary.length; i++) {
            ary[i][0] = 1;
        }
        // 계산시작
        // 로직으로는 (i,j)의 사람은 (i,j-1) + (i-1,j)임으로 이를 사용
        for (int i = 1; i < ary.length; i++) {
            for (int j = 1; j < ary[0].length; j++) {
                ary[i][j] = ary[i][j - 1] + ary[i - 1][j];
            }
        }
        return ary[a][b - 1];
    }

}
