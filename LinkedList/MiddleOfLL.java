package LinkedList;

public class MiddleOfLL{
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int getMidOfLL(){
        if(head == null){
            return -1; // Empty list
        }else if(head.next == null){
            return head.data; // Single node list
        }else{
            Node slow = head;
            Node fast = head;
            while(fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
            }
            return slow.data;
        }
    }
    
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    
    public void display() {
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {

        MiddleOfLL list = new MiddleOfLL();

        System.out.println("\nOriginal Linked Lins.");
        list.insertAtEnd(2);
        list.insertAtEnd(6);
        list.insertAtEnd(28);
        list.insertAtEnd(5);
        list.display();

        System.out.println("\nFor even Linkedlist:-----");
        System.out.println("Middle element of the Linked List is: " + list.getMidOfLL());

        list.insertAtEnd(21);
        list.insertAtEnd(11);
        list.insertAtEnd(37);
        list.display();
        System.out.println("\nFor odd Linkedlist:-----");
        System.out.println("Middle element of the Linked List is: " + list.getMidOfLL());

    }
}
