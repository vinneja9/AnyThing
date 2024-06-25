package School.ch2024FirstOTT;

import java.util.*;

public class CollectionEx1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();

        for (int i = 1; i <= 5; i++) {
            al.add(i);
        }

        System.out.println(al);
        System.out.println("리스트의 크기 : " + al.size());

        al.remove(3);
        System.out.println(al);

        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
        System.out.println("\n리스트의 크기 : " + al.size());
    }
}
