package School.ch2023SecondComputerPro;

public class Main3 {
    public static void main(String[] args) {

        if (args.length == 2) {
            int i = Integer.parseInt(args[1]);
            nPrintln(args[0], i);
        } else
            System.out.println("인수가 없네요. 인수를 2개 입력하시오!");

    }

    public static void nPrintln(String s, int n) {
        for (int i = 0; i < n; i++)
            System.out.println(s);
    }
}
// 각 객체를 참조하는것을 알아보자2//