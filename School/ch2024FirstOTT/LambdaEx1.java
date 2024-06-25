package School.ch2024FirstOTT;

@FunctionalInterface
interface Myfunction {
    int calc(int i);
}

public class LambdaEx1 {

    public LambdaEx1() {
        Myfunction isquare = (i) -> {
            return i * i;
        };
        System.out.println("i의 제곱: " + isquare.calc(9));
    }

    public static void main(String[] args) {
        new LambdaEx1();
    }
}
