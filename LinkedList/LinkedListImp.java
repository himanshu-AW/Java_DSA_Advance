package LinkedList;

public class LinkedListImp {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert a node at the beginning of the list
    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // insert after the given node
    public void insertAfter(Node prevNode, int data) {
        if (prevNode == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node newNode = new Node(data);
        newNode.next =  prevNode.next;
        prevNode.next = newNode;
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
    
    // implementation of deleteion of specified node position.
    public void deleteNode(int position) {
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        else if (position < 0) {
            System.out.println("Position is invalid");
            return;
        }else if(position == 0){
            head = head.next;
            return;
        }else{
            Node temp = head;
            for(int i=1;i<position-1 && temp!=null;i++){
                temp = temp.next;
            }
            if(temp == null || temp.next == null){
                System.out.println(position+"th Position is out of range");
                return;
            }
            temp.next= temp.next.next;
        }
    }


    // implementation of deletion at the front
    public void deleteAtFront(){
        if(head == null){
            System.out.println("\n Linked List is empty!");
            return;
        }else{
            head=head.next;
        }
    }

    // implementation of deletion at the end
    public void deleteAtEnd(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        else if (head.next==null) {
            head=head.next;
            return;
        }else{
            Node temp = head;
            while(temp.next.next!=null){
                temp = temp.next;
            }
            temp.next= temp.next.next;
        }
    }

    // display linked list
    public void display() {
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedListImp list = new LinkedListImp();
        System.out.println("\nInsertion at the Front of Linked Lins.");
        list.insertAtFirst(2);
        list.insertAtFirst(4);
        list.insertAtFirst(5);
        list.display();
        
        System.out.println("\nInsertion at the End of Linked Lins.");
        list.insertAtEnd(6);
        list.insertAtEnd(28);
        list.insertAtEnd(99);
        list.display();
        
        System.out.println("\nInsertion  after the Node of Linked Lins.");
        list.insertAfter(null, 99);
        list.insertAfter(list.head.next.next, 10);
        list.insertAfter(list.head.next.next, 54);
        list.display();

        System.out.println("\nDeletion of Node at position 4.");
        list.deleteNode(4);
        list.deleteNode(7);
        list.display();

        System.out.println("\nDeletion of first node.");
        list.deleteAtFront();
        list.display();

        System.out.println("\nDeletion of first node.");
        list.deleteAtEnd();
        list.display();




    }
}
