package School.ch2023SecondComputerPro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>(); // 자동으로 부피가 늘어나는 어레이 리스트//
        int data;
        int sum = 0;
        System.out.println("성적을 입력:");
        while ((data = sc.nextInt()) >= 0) {
            al.add(data);
        }
        for (int i = 0; i < al.size(); ++i) {
            sum += al.get(i);
        }
        int sz = al.size();
        System.out.println("인원: " + sz + "명, 평균: " + (double) sum / sz);
        System.out.println(al);
    }
}
