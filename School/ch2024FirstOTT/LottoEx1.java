package School.ch2024FirstOTT;

public class LottoEx1 {
    public static void main(String[] args) {

        int lotto[] = new int[6];

        System.out.print("Lotto Random(예측): ");

        for (int i = 0; i < lotto.length; i++) {
            int lNumber = (int) (Math.random() * 45) + 1;
            lotto[i] = lNumber;
            int k = i;

            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }
            if (k == i) {
                System.out.print(lotto[i] + " ");
            }
        }
    }
}
