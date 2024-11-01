package LinkedList;

public class ReverseOfLL {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // implementation of Reverse of the list
    public void reverseLL(){
        if(head == null){
            System.out.println("\nLinked List is empty!");
            return;
        }else if(head.next == null){ // there is only one node in list
            return;
        }
        else{
            Node prevNode = null;
            Node currentNode = head;
            Node nextNode = null;

            while (currentNode!=null) {
                nextNode  = currentNode.next;
                currentNode.next=prevNode;
                prevNode = currentNode;
                currentNode = nextNode;
            }

            head=prevNode;
        }
        
    }

    // implementation of reverse the list using recursive approach
    public void reverseLLRecursive(Node currentNode, Node prevNode){
        // base case
        if(currentNode.next == null){
            head= currentNode;
            currentNode.next=prevNode;
            return;
        }
        // if current node is not the last node then
        Node nextNode = currentNode.next;
        currentNode.next=prevNode;
        reverseLLRecursive(nextNode, currentNode);
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

        ReverseOfLL list = new ReverseOfLL();

        System.out.println("\nInsertion at the End of Linked Lins.");
        list.insertAtEnd(2);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.insertAtEnd(6);
        list.insertAtEnd(28);
        list.insertAtEnd(99);
        list.display();

        System.out.println("\nReversed Linked List:");
        list.reverseLL();
        list.display();

        System.out.println("\nReversed Linked List using Recursive approach:");
        list.reverseLLRecursive(list.head,null);
        list.display();
    }
}
