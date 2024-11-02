package LinkedList;

public class Palindrome {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node reverseOfLL(Node node) {
        Node prevNode = null;
        Node currentNode = node;
        Node nextNode = null;

        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        node.next = null;
        return prevNode;
    }

    public boolean isPaindrome(Node node) {
        // find middle of ll
        Node slow = node;
        Node fast = node.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        // reverse of 2nd half of ll
        Node secondHalf = reverseOfLL(slow);

        // compare 1st half with reversed 2nd half
        Node temp=head;
        while(secondHalf!=null && temp.next != null){
            if (temp.data!= secondHalf.data)
                return false;
            temp = temp.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Palindrome list = new Palindrome();

        System.out.println("\nOriginal Linked Lins.");
        list.insertAtEnd(2);
        list.insertAtEnd(6);
        list.insertAtEnd(3);
        list.insertAtEnd(6);
        list.insertAtEnd(2);
        list.display();

        if(list.isPaindrome(list.head)){
            System.out.println("Linked list is palindrome.");
        }else
        System.out.println("Linked list is not Palindrome.");
        list.display();

    }
}
