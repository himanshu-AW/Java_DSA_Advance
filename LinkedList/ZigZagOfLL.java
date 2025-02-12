package LinkedList;

public class ZigZagOfLL {

    
    class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    Node head;
    public void zigZag() {
        // Step 1: Find the middle of the linked list
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
    
        // Step 2: Reverse the second half of the linked list
        Node currentNode = mid.next;
        mid.next = null; // Split the list into two halves
        Node prevNode = null;
        Node nextNode;
    
        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        // 'prevNode' is now the head of the reversed second half
    
        // Step 3: Merge the two halves in zigzag fashion
        Node left = head;
        Node right = prevNode;
        Node nextL, nextR;
    
        while (left != null && right != null) {
            nextL = left.next;  // Store the next node in the first half
            nextR = right.next; // Store the next node in the second half
    
            left.next = right;  // Link the current node from the first half to the head of the reversed second half
            if (nextL == null) break; // If no more nodes on the left side, break out of the loop
    
            right.next = nextL; // Link the current node from the reversed second half to the next node in the first half
    
            // Move to the next pair of nodes
            left = nextL;
            right = nextR;
        }
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
        ZigZagOfLL list = new ZigZagOfLL(); 

        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.insertAtEnd(6);
        System.out.println("\nOriginal Linked Lins.");
        list.display();

        list.zigZag();
        System.out.println("\nZigZag Linked List.");
        list.display();

    }
}
