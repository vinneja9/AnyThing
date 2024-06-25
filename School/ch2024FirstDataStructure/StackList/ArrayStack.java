package School.ch2024FirstDataStructure.StackList;

import java.util.EmptyStackException;

public class ArrayStack<E> implements Stack<E> {
    public int top = -1;
    public Object[] arr = new Object[20];

    // 여기서 스택크기 조절가능 (일단은 20)
    public ArrayStack() {
        // 왜인지 모르겠지만, 작동이 안되서 일단 위에 new Object[20]; 씀
    }

    public boolean empty() {
        return top < 0;
    }

    @SuppressWarnings("unchecked")
    public E peek() {
        if (top < 0) {
            // 아무것도 안들어있으면, 애러 발생
            throw new EmptyStackException();
        }
        return (E) arr[top];
    }

    @SuppressWarnings("unchecked")
    public E pop() {
        if (top < 0) {
            // 아무것도 안들어있으면, 애러 발생
            throw new EmptyStackException();
        }
        return (E) arr[top--];
    }

    public E push(E item) {

        arr[++top] = item;
        return item;
    }
}
