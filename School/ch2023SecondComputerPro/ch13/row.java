package School.ch2023SecondComputerPro.ch13;

public class row {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; ++i) {
            for (int j = 0; j < i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.err.println("====================");

    }

}