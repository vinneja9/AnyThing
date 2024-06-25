package School.ch2024FirstDataStructure.StackList;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ArrayStack<Object> stack = new ArrayStack<Object>();

        stack.push("Sample");
        stack.push(new Date());

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.empty());
        System.out.println(stack.pop());
        System.out.println(stack.empty());
    }
}
