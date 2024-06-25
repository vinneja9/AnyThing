package School.ch2024FirstDataStructure.DoubleLinked;

public class DoubleLinkedList<E> {

    public class ListNode {
        ListNode rlink;
        ListNode llink;
        E data;
    }

    protected ListNode head = null;
    protected ListNode tail = null;
    protected int length = 0;

    public void addFirstNode(E e) {
        ListNode newNode = new ListNode();
        newNode.data = e;
        if (head == null) {
            tail = newNode;
        } else {
            head.llink = newNode;
            newNode.rlink = head;
        }
        head = newNode;
        length++;
    }

    public void addLastNode(E e) {
        ListNode newNode = new ListNode();
        newNode.data = e;
        if (head == null) {
            head = newNode;
        } else {
            tail.rlink = newNode;
            newNode.llink = tail;
        }
        tail = newNode;
        length++;
    }

    public String addNode(int index, E e) {
        if (index == 0 && length == 0) {
            ListNode newNode = new ListNode();
            newNode.data = e;
            head = tail = newNode;
            length++;
            return "비어있는 리스트에 '" + e + "' 를 삽입하였습니다.";
        }
        if (index + 1 > length || index < 0) {
            return "Index가 0미만, length초과 입나다";
        }
        ListNode newNode = new ListNode();
        newNode.data = e;
        ListNode p = head;
        for (int i = 0; i < index; i++) {
            p = p.rlink;
        }
        if (index == 0) {
            head = newNode;
        }
        if (index + 1 == (length)) {
            tail = newNode;
        }
        newNode.rlink = p;
        newNode.llink = p.llink;
        p.llink = newNode;
        length++;
        return " ' " + p.data + " '의 위치에 삽입하였습니다.";

    }

    public void removeLastNode() {

    }

}
