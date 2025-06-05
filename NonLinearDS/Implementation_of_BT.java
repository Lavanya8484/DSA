Node root = new Node(1);
-ask node should added left/right
  if flag = true then add New Node left
- Always go from left to right 


  import java.util.*;
class Main{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data1){
            this.data = data1;
        }
    }
   private Node root;
   void createTree(Scanner sc){
        System.out.println("Enter the root-value");
        int val = sc.nextInt();
        root = new Node(val);
        helperTree(sc,root);
        
    }
    
    private void helperTree(Scanner sc,Node node){
        System.out.println("Do you want to add left of " + node.data);
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("Enter the left value of "+ node.data);
            int val = sc.nextInt();
            node.left = new Node(val);
            helperTree(sc,node.left);
        }
         System.out.println("Do you want to add right of "+ node.data);
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("Enter the right value of "+node.data);
            int val = sc.nextInt();
            node.right = new Node(val);
            helperTree(sc,node.right);
        }
    }
   void display() {
    System.out.println("PreOrder:");
    preOrder(root);
    System.out.println("\nInOrder:");
    inOrder(root);
    System.out.println("\nPostOrder:");
    postOrder(root);
}

private void preOrder(Node node) {
    if (node == null) return;
    System.out.print(node.data + " ");
    preOrder(node.left);
    preOrder(node.right);
}

private void inOrder(Node node) {
    if (node == null) return;
    inOrder(node.left);
    System.out.print(node.data + " ");
    inOrder(node.right);
}

private void postOrder(Node node) {
    if (node == null) return;
    postOrder(node.left);
    postOrder(node.right);
    System.out.print(node.data + " ");
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Main tree = new Main();
        tree.createTree(sc);
        tree.display();
        
    }
}
