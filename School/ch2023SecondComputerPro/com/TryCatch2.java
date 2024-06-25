package School.ch2023SecondComputerPro.com;

public class TryCatch2 {
    public void endMessage() {
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        TryCatch2 tc = new TryCatch2();
        int c;

        try {
            c = 7 / 0;
        } catch (ArithmeticException a) {
            System.out.println("오류 이유" + a.getMessage() + "/ -1 대입합니다.");
            c = -1;
            System.out.println("c = " + c);
        } finally {
            tc.endMessage();
        }
    }
}
