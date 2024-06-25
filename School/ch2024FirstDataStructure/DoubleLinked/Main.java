package School.ch2024FirstDataStructure.DoubleLinked;

public class Main {
    public static void main(String[] args) {

        DoubleLinkedList<String> LinkedList = new DoubleLinkedList<>();
        LinkedList.addFirstNode("hekll");
        LinkedList.addLastNode("bay");
        System.out.println(LinkedList.addNode(0, "hi"));
        System.out.println(LinkedList.head.rlink.data);
    }
}
