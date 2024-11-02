package LinkedList;

public class MergeSortLL {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node merge(Node left, Node right){
        Node dummy = new Node(0);
        Node temp=dummy;

        while(left!=null && right!=null){
            if(left.data <= right.data){
                temp.next=left;
                left=left.next;
            }else{
                temp.next=right;
                right=right.next;
            }
            temp=temp.next;
        }

        while(left!=null){
            temp.next=left;
            left=left.next;
            temp=temp.next;
        }

        while(right!=null){
            temp.next=right;
            right=right.next;
            temp=temp.next;
        }

        return dummy.next;
    }

    public Node mergeSort(Node node) {
        if (node == null || node.next == null) {
            return node; // Base case: If list has only one node or no nodes, return the list
        }

        // find mid node of ll
        Node slow = node, fast = node.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow.next; // Save the next node of mid
        slow.next=null;

        Node left = mergeSort(node);
        Node right = mergeSort(mid);

        return merge(left,right);
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
        MergeSortLL list = new MergeSortLL();
        System.out.println("\nOriginal Linked Lins.");
        list.insertAtEnd(8);
        list.insertAtEnd(6);
        list.insertAtEnd(5);
        list.insertAtEnd(3);
        list.insertAtEnd(2);
        System.out.println("\nOriginal Linked Lins");
        list.display();

        System.out.println("\nSorted Linked List:");
        list.head = list.mergeSort(list.head);
        list.display();
    }
}
