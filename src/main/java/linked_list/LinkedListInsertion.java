package linked_list;
public class LinkedListInsertion {
    Node head;
    static class Node {
        int data;
        Node next;

        public Node() {
            data = data;
            next = null;
        }
    }
    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    public static void main(String[] args) {
        LinkedListInsertion list = new LinkedListInsertion();
        list.insert(3);
        list.insert(5);
        list.insert(7);
        list.show();
    }
}










