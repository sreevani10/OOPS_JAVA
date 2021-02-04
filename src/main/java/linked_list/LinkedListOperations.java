package linked_list;
public class LinkedListOperations {
    Node head;
    class Node {
        int data;
        Node next;

        public Node() {
            data = data;
            next = null;
        }
    }
    public void Insert(int data){
        Node node=new Node();
        node.data=data;
        node.next=null;
        if(head==null){
            head=node;
        }
        else{
            Node n = head;
            while (n.next!=null){
               n=n.next;
            }
            n.next=node;
        }
    }
    public void InsertAtBegin(int data){
        Node node = new Node();
        node.data=data;
        node.next=null;
        node.next=head;
        head=node;
    }
    public void InsertAt(int index,int data){
        Node node = new Node();
        node.data=data;
        node.next=null;
        if (index == 0) {
            InsertAtBegin(data);
        }
        Node n = head;
        for(int pos=0;pos<index;pos++){
            n=n.next;
        }
        node.next=n.next;
        n.next=node;
    }
    public void show(){
        Node node =head;
        while (node.next!=null) {
            System.out.println(node.data);
            node=node.next;
        }
        System.out.println(node.data);
    }
    public void deleteAt(int index){
        if(index==0){
            head=head.next;
        }
        else {
            Node n = head;
            Node n1=null;
            for(int pos=0;pos<index-1;pos++){
                n=n.next;
            }
            n1=n.next;
            n.next=n1.next;
            System.out.println("n1 "+ n1.data);
            n1=null;
        }
    }

    public static void main(String[] args) {
        LinkedListOperations list = new LinkedListOperations();
        list.Insert(3);
        list.Insert(6);
        list.Insert(9);
        list.InsertAtBegin(7);
        list.InsertAt(2,5);
        list.deleteAt(1);
        list.show();
    }
}
