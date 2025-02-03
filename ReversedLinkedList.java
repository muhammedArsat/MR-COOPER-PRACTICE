 class LinkedList{

    class Node{
        int val;
        Node next;

        Node(int data){
            this.val = data;
            this.next = null;
        }
    }

    Node root;

    public void insert(int val){
        root = insert(root, val);
    }

    public Node insert(Node root, int val){
        Node node = new Node(val);
        if(root == null)
            return node;
        Node current = root;

        while(current.next != null){
            current = current.next;
        }

        current.next = node;
        return root;

    }

public void print(){
    Node current = root;
    while(current != null){
        System.out.print(current.val+" ");
        current = current.next;
    }
}

public void reverse(){
    Node prev = null;
    Node next = null;
    Node current = root;

    while(current != null){
        next = current.next;
        current.next = prev;
        prev = current;
     current = next;
    }
    root = prev;

}

}


public class ReversedLinkedList {

public static void main(String[] args) {
    LinkedList linkedList =  new LinkedList();
    linkedList . insert(1);
    linkedList . insert(2);
    linkedList . insert(3);
    linkedList.reverse();
    linkedList.print();

}

}
