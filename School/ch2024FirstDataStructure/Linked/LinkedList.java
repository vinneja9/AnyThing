package School.ch2024FirstDataStructure.Linked;

public class LinkedList {

    class ListNode {
        String data;
        ListNode link;
    }

    protected ListNode head;

    public void addFirstNode(String x) {
        ListNode newNode = new ListNode();
        newNode.data = x;
        newNode.link = head;
        head = newNode;
    }

    public void addLastNode(String x) {
        ListNode newNode = new ListNode();
        newNode.data = x;
        if (head == null) {
            newNode.link = head;
            head = newNode;
            // 일반적이지 않은부분, 공백리스트일 경우//
        } else {
            ListNode p = head;
            while (p.link != null) {
                p = p.link;
            }
            p.link = newNode;
            // else부분 일반적인 경우//
        }
    }

    public void insertNode(ListNode p, String x) {
        ListNode newNode = new ListNode();
        newNode.data = x;

        if (head == null || p == null) {
            newNode.link = head;
            head = newNode;
            // 일반적이지 않은경우//
        } else {
            newNode.link = p.link;
            p.link = newNode;
            // 일반적인 경우//
        }
    }

    public void searchNode(String x) {
        ListNode p = head;
        while (p.link != null) {
            if (p.data.equals(x)) {
                System.out.println(p);
            }
            p = p.link;
        }
        System.out.println(p);
    }

    public ListNode deletNode(ListNode q) {
        ListNode p = head;
        while (p != null) {
            if (p.link == q) {
                p.link = q.link;
                q.link = null;
                return q;
            }
        }
        return p;
    }

    public void reverse() {
        ListNode p = head;
        ListNode q = null;
        ListNode r = null;
        // 각각 p는 포인터 (즉 바꾸고 싶은위치), q는 바꿔야되는위치, r은 포인터2
        while (p != null) {

            r = p;
            p = r.link;
            r.link = q;
            q = r;
            // r을 p로 이동,
            // p는 다음 노드로 이동
            // r.link를 q에 연결
            // q를 r에 이동
        }
        head = q;
        // p가 null임으로 p전인 q를 head에 넣어서 완성시킨다
    }

    public void deletLastNode() {
        if (head == null) {
            return;
        }
        if (head.link == null) {
            head = null;
            return;
        } else {
            ListNode p = head;
            while (p.link.link != null) {
                p = p.link;
            }
            p.link = null;
        }
        return;
    }

    public void printList() {
        ListNode p;
        System.out.print("(");
        p = head;
        while (p != null) {
            System.out.print(p.data);
            p = p.link;
            if (p != null) {
                System.out.print(", ");
            }
        }
        System.out.print(")");
    }

    public String set(int index, String x) {
        ListNode p = head;
        String temp = null;
        for (int i = 0; i != index; i++) {
            if (p == null) {
                return null;
            }
            p = p.link;
        }
        temp = p.data;
        p.data = x;
        return temp;
    }

    public String get(int index) {
        ListNode p = head;
        for (int i = 0; i != index; i++) {
            if (p == null) {
                return null;
            }
            p = p.link;
        }
        return (String) p.data;
    }
}
