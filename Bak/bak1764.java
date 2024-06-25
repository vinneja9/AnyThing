package Bak;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class bak1764 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String resive[] = br.readLine().split(" ");
        Map<String, Integer> dontKnowPerson = new HashMap<>(Integer.parseInt(resive[0]));
        int count = 0;
        List<String> list = new ArrayList<String>();

        for (int i = 0; i < Integer.parseInt(resive[0]); ++i) {
            dontKnowPerson.put(br.readLine(), 1);
        }
        // 사전순 하기
        for (int i = 0; i < Integer.parseInt(resive[1]); ++i) {
            String key = br.readLine();
            if (dontKnowPerson.containsKey(key)) {
                list.add(key);
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.newLine();
        // 이게 arraylist sort 하는 거임 collections
        Collections.sort(list);

        for (int i = 0; i < count; ++i) {
            bw.write(list.get(i));
            bw.newLine();
        }

        bw.close();

    }
}
