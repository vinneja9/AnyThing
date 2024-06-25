package School.ch2024FirstDataStructure.Queue;

public class Queue {
    private Object[] q;
    private int front, rear;
    private int n = 10; // 이게 큐의 길이

    public Queue() {
        q = new Object[n];
        front = rear = -1;
    }

    public boolean isEmpty() {
        return (front == rear);
    }

    public void enqueu(Object item) { // 큐에 삽입
        if (rear == n - 1) { // 만약에 rear가 n-1(즉 꽉참)면, 오류
            throw new QueueFullException();
        }
        rear += 1; // rear를 ++
        q[rear] = item; // q[rear]에 item 넣기
    }

    public Object deque() { // 큐를 출력삭제
        if (isEmpty()) {
            throw new QueueEmptyException();
        }
        front++; // front에 ++ 함으로써 앞에있는것을 삭제하고 다음으로 넘어감
        return q[front]; // 애초에 front는 -1부터 출발이라 ++하고 뽑아야됨
    }

    public Object peek() {
        if (isEmpty()) {
            throw new QueueEmptyException();
        }
        return q[front + 1];
    }

    public void delete() {
        if (isEmpty()) {
            throw new QueueEmptyException();
        }
        front++;
    }

    public class QueueEmptyException extends RuntimeException {
    }

    public class QueueFullException extends RuntimeException {
    }
}