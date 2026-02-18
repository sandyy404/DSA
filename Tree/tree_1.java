import java.util.*;

public class tree_1{
   static class Node{
      int data;
      Node left,right;
      Node(int data){
         this.data = data;
         left = right= null;
      }
   }
   static class BinaryTree{
         static int idx = -1;
         public static Node buildTree(int nodes[]){
            idx++;
           if(nodes[idx]==-1){
            return null;
           }
           Node newNode = new Node(nodes[idx]);
           newNode.left = buildTree(nodes);
           newNode.right = buildTree(nodes);
           return newNode;
         }
      }
    
      // preorder traversal
      public static void preorder(Node root){
         if(root ==null){
            return;
         }
         System.out.print(root.data+" ");
         preorder(root.left);
         preorder(root.right);
      }
   public static void inorder(Node root){
      if(root!=null){
         inorder(root.left);
         System.out.print(root.data+" ");
         inorder(root.right);
      }
   }
   public static void postorder(Node root){
      if(root!=null){
         postorder(root.left);
         postorder(root.right);
         System.out.print(root.data +" ");
      }
   }
   public static void levelorder(Node root){
    Queue<Node> q= new LinkedList<>();
      q.add(root);
      q.add(null);
      while(!q.isEmpty()){
         Node currNode = q.remove();
         if(currNode==null){
            System.out.println();
            if(q.isEmpty()){
               break;
            }else{
               q.add(null);
            }
         }else{
            System.out.print(currNode.data+" ");
            if(currNode.left!=null){
               q.add(currNode.left);
            }
            if(currNode.right!=null){
               q.add(currNode.right);
            }
         }
      }
   }
   // Count of Nodes
   public static int CountOfNodes(Node root){
      if(root==null)return 0;
      int leftCount = CountOfNodes(root.left);
      int rightCount = CountOfNodes(root.right);
      int total = leftCount +rightCount +1;
      return total;
   }

   public static int SumOfNodes(Node root){
      if(root==null)return 0;
      int leftCount =SumOfNodes(root.left);
      int rightCount =SumOfNodes(root.right);
      int total = leftCount +rightCount +root.data;
      return total;
   }
   public static void main(String[] args) {
      int []nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
      BinaryTree tree= new BinaryTree();
       Node root = tree.buildTree(nodes);
      //  System.out.println("PreOrder");
      // preorder(root);
      // System.out.println();
      // System.out.println("InOrder");
      // inorder(root);
      // System.out.println();
      // System.out.println("PostOrder");
      // postorder(root);
      // System.out.println();
      // System.out.println("LevelOrder");
      // levelorder(root);
      // int a = CountOfNodes(root);
      // System.out.println(a);
      int sum = SumOfNodes(root);
      System.out.println(sum);

   }
}
