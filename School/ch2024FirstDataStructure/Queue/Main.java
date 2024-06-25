package School.ch2024FirstDataStructure.Queue;

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueu("3");
        System.out.println(q.peek());
        q.delete();
        q.enqueu("10");
        q.enqueu("12");
        System.out.println(q.deque());
    }
}
