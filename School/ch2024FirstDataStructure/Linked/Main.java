package School.ch2024FirstDataStructure.Linked;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLastNode("kim");
        list.addFirstNode("GYU");
        list.deletLastNode();
        list.addLastNode("Min");
        list.addFirstNode("Pero");
        list.printList();
        list.reverse();
        list.printList();
        System.out.println(list.set(0, "hello"));
        list.printList();
        System.out.println(list.get(0));
    }

}
