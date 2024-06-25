package School.ch2023SecondComputerPro.ch13;

public class row2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; ++i) {
            for (int j = 9; j > i; --j) { // if (i<k) 일떄 true 면 print(" ") else 면 print("*") //
                System.out.print(" ");
            }
            for (int k = 0; k < i; ++k) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}