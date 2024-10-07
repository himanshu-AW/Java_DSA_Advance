// Given a Binary Tree (BT), convert it to a Doubly Linked List (DLL) in place. The left and right pointers in nodes will be used as previous and next pointers respectively in converted DLL. The order of nodes in DLL must be the same as the order of the given Binary Tree. The first node of Inorder traversal (leftmost node in BT) must be the head node of the DLL.
// Note: h is the tree's height, and this space is used implicitly for the recursion stack.

// Examples:
// Input:
//       1
//     /  \
//    3    2
// Output:
// 3 1 2 
// 2 1 3

// Explanation: DLL would be 3<=>1<=>2
// Input:
//        10
//       /   \
//      20   30
//    /   \
//   40   60
// Output:
// 40 20 60 10 30 
// 30 10 60 20 40

// Explanation:  DLL would be 40<=>20<=>60<=>10<=>30.
// Expected Time Complexity: O(no. of nodes)
// Expected Space Complexity: O(height of the tree)

// Constraints:
// 1 ≤ Number of nodes ≤ 105
// 0 ≤ Data of a node ≤ 10



// Definition for a binary tree node
class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class BinaryTreeToDLL {
    
    // Pointer to the head of the Doubly Linked List
    Node head = null;

    // Pointer to keep track of the previously visited node
    Node prev = null;

    // Function to convert binary tree to doubly linked list in-place
    public void convertToDLL(Node root) {
        // Base case
        if (root == null) return;

        // Recursively convert the left subtree
        convertToDLL(root.left);

        // Process the current node
        if (prev == null) {
            // This is the leftmost node, which will be the head of the DLL
            head = root;
        } else {
            // Link the current node with the previous node
            root.left = prev;
            prev.right = root;
        }
        
        // Update the previous node to the current node
        prev = root;

        // Recursively convert the right subtree
        convertToDLL(root.right);
    }

    // Utility function to print the doubly linked list from head to tail
    public void printDLL() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.right;
        }
        System.out.println();
    }

    // Utility function to print the doubly linked list from tail to head
    public void printDLLReverse() {
        Node current = head;
        // Move to the end of the list
        while (current != null && current.right != null) {
            current = current.right;
        }
        
        // Print in reverse order
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.left;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Construct the binary tree
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(60);

        // Convert the binary tree to doubly linked list
        BinaryTreeToDLL treeToDLL = new BinaryTreeToDLL();
        treeToDLL.convertToDLL(root);

        // Print the doubly linked list from head to tail
        treeToDLL.printDLL(); // Output: 40 20 60 10 30 

        // Print the doubly linked list from tail to head
        treeToDLL.printDLLReverse(); // Output: 30 10 60 20 40 
    }
}
