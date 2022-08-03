import java.util.*;

public class Exercise_4{
    
    public static void main(String[] args) {
        System.out.println("Enter the number of nodes on the BST: ");
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        
        System.out.println("Enter each node's value: ");
        BST tree = new BST();
        
        while(t-- > 0) {
            int data = scan.nextInt();
            tree.insert(data);
        }
        scan.close();
        
        System.out.println("Pre Order traversal: ");
        tree.preOrder();
        System.out.println();

        System.out.println("In Order traversal: ");
        tree.inOrder();
        System.out.println();

        System.out.println("Post Order traversal: ");
        tree.postOrder();
        System.out.println();

        System.out.println("The height of the tree is: " + tree.height());
        System.out.println();
    } 
}

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class BST {

  Node root = null;
  
   public void insert(int data)
   {
     root = insert(root,data);
   }
  
    public Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
    
    public void preOrder()
    {
        preOrder(root);
    }

    public void preOrder(Node root)
    {
        if(root==null)
            return;
        else
        {    
            System.out.print(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public void inOrder()
    {
        inOrder(root);
    }

    public void inOrder(Node root)
    {
        if(root==null)
            return;
        else{
            inOrder(root.left);
            System.out.print(root.data);
            inOrder(root.right);
        }
    }

    public void postOrder() {
        preOrder(root);
    }

    public void postOrder(Node root) {
        if (root == null)
            return;
        else {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data);
        }
    }

    public int height()
    {
        return height(root);
    }

    public int height(Node root)
    {
        if(root==null)
            return 0;
        else
        {
            int leftsubtreeheight = height(root.left);
            int rightsubtreeheight = height(root.right);
            if(leftsubtreeheight<=rightsubtreeheight)
                return rightsubtreeheight+1;
            else
                return leftsubtreeheight+1;
        }
    }

}

