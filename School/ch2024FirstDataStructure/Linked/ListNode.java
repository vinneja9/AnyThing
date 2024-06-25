
package School.ch2024FirstDataStructure.Linked;

public class ListNode {
    String data;
    ListNode link;

    public ListNode() {
        data = null;
        link = null;
    }

    public ListNode(String val) {
        data = val;
        link = null;
    }

    public ListNode(String val, ListNode p) {
        data = val;
        link = p;
    }
}
