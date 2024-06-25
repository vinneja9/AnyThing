package School.ch2024FirstDataStructure.StackList;

import java.util.EmptyStackException;

public class ListStack<E> extends ArrayStack<E> {
    // 안만들어도 됨
    public int top = -1;
    public Object list[] = new Object[20];

    public class listNode<E> {
        E data;
        listNode link;
    }

    public E push(E item) {
        listNode newList = new listNode<E>();
        newList.data = item;
        this.list[++top] = newList;
        return item;
    }

}
