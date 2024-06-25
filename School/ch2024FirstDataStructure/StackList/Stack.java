package School.ch2024FirstDataStructure.StackList;

public interface Stack<E> {
    public boolean empty();

    public E peek();

    public E pop();

    public E push(E item);
}
