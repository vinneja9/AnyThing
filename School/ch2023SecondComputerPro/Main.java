package School.ch2023SecondComputerPro;

public class Main {
    public static void main(String[] args) {
        double[][] ints = { { 2.2, 3.5, 4.5, 4.6 },
                { 3.2, 3.8, 3.9, 3.5 },
                { 1.6, 1.2, 2.8, 4.0 }, };
        // 어레이//
        double[] s1 = { 0.0, 0.0, 0.0 };
        double s2 = 0.0;

        for (int i = 0; i < ints.length; ++i) {
            for (int j = 0; j < ints[i].length; ++j) {
                s1[i] += ints[i][j];
            }
            System.out.printf("%d 차년도 평균 이자율(%%): %.2f%% \n", i + 1, s1[i] / 4);
            s2 += s1[i];

        }
        System.out.printf("3년 총 이자(%%): %.2f%% \n", (s2 / (3 * 4)));

    };
}
