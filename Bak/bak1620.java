package Bak;

import java.io.*;
import java.util.*;

public class bak1620 {
    // 해쉬맵을 이용한 어쩌구
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String resive[] = br.readLine().split(" ");

        Map<Integer, String> mapM = new HashMap<>(Integer.parseInt(resive[0]));
        Map<String, Integer> mapMR = new HashMap<>(Integer.parseInt(resive[0]));

        for (int i = 1; i <= Integer.parseInt(resive[0]); i++) {
            String pokimon = br.readLine();
            mapM.put(i, pokimon);
            mapMR.put(pokimon, i);
        }

        for (int i = 0; i < Integer.parseInt(resive[1]); ++i) {
            String question = br.readLine();
            if (isInt(question)) {
                bw.write(mapM.get(Integer.parseInt(question)));
            } else {
                bw.write(String.valueOf(mapMR.get(question)));
            }
            bw.newLine();

        }
        bw.flush();
        bw.close();
    }

    public static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
