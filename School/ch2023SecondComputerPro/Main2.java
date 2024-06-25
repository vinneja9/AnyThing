package School.ch2023SecondComputerPro;

public class Main2 {
    public static void main(String[] args) {
        int[] hello = { 10 };
        System.out.println("호출 전의 hello[0]는: " + hello[0]);
        hhuuuu(hello);
        System.out.println("호출 후의 hello[0]는: " + hello[0]);
    }

    public static void hhuuuu(int[] bay) {
        System.out.println("크기를 키우기전" + bay[0]);
        bay[0]++;
        System.out.println("크기를 키운후" + bay[0]);
    }
}
// 각 객체를 참조하는것을 알아보자//