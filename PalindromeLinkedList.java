import java.util.*;


class LinkedList{

    class Node{
        char val;
        Node next;

        Node(char data){
            this.val = data;
            this.next = null;
        }
    }
    private Node root;


    public void insert (char val){
        root = insert(root,val);
    }
    private Node insert(Node root, char val){
        if(root == null) return new Node(val);

        Node current = root;

        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(val);
        return root;
    }


    public void print(){
        Node current  = root;

        while(current !=null){
            System.out.print(current.val+" ");
            current = current.next;
        }
    }

 public void palindrome(){
    Node current = root;
    Stack<Character> stack = new Stack<>();
    while(current != null){
        stack.push(current.val);
        current = current.next;
    }

    current = root;

    while(current != null)
    {
        if(current.val != stack.pop()){
            System.out.println(false);
            return;
        }

        current=current.next;
    }

    System.out.println(true);
 }

}
public class PalindromeLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert('b');
        linkedList.insert('a');
        linkedList.insert('a');


        System.out.println("Printing of LinkedList: ");
        linkedList.print();
        System.out.println();
        System.out.println("Palindrome or Not :");
        linkedList.palindrome();

    }
}
