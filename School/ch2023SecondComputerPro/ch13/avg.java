package School.ch2023SecondComputerPro.ch13;

public class avg {
    public static void main(String[] args) {
        int[][] array = { { 91, 80 }, { 85, 92, 78 }, { 68, 93, 78, 90 } };
        System.out.println(array.length + " " + array[2].length); // 이로써 그냥 length는 3, [2]의 length 는 4을 값을 갖는다//
        int sum = 0;
        double avg = 0.0;
        double len = 0.0;
        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array[i].length; ++j) {
                sum += array[i][j];
                ++len;
            }
        }
        avg = sum / len;
        System.out.printf("===>> 평균은 %.2f점 입니다. 총합은 %d점 입니다. <<===", avg, sum);

    }
}
