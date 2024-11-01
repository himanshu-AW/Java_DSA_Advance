package LinkedList;

public class IsCycleInLL {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    // check is there any cycle in ll
    public boolean isCycle() {
        Node slow = head, fast = head;
        while(slow.next != null && fast!=null && fast.next!=null ){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){ // a cycle found
                return true;
            }
        }
        return false; // no cycle found
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

        IsCycleInLL list = new IsCycleInLL();

        list.insertAtEnd(2);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.insertAtEnd(6);
        list.insertAtEnd(28);
        list.insertAtEnd(99);

        // make cycle in LL
        Node temp = list.head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = list.head;

        if(list.isCycle()){
            System.out.println("\nCycle is detected in the Linked list");
        }
        else{
            System.out.println("\nCycle is not detected in the Linked list");
        }
        
    }
}
