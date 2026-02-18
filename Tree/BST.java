
public class BST {

    static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {

            return new Node(val);
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // to check the tree is bst or not we use inorder traversal;
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // searching the element 
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else if (root.data == key) {
            return true;
        } else {
            return search(root.right, key);
        }
    }

    // Deleting the element
    public static Node delete(Node root, int val) {
        if (root == null) {
            return null;
        }
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else {
            // case :-1
            if (root.left == null && root.right == null) {
                return null;
            }
            //case:-2
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            //case :-3
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int[] values = {5, 1, 3, 4, 2, 7};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
           inorder(root);

           System.out.println();
        //   if(search(root, 9)){
        //    System.out.println("found");
        //   }else{
        //    System.out.println("Not present");
        //   }
        
         delete(root, 4);
        System.out.println("BST after deletion:");
        inorder(root);
        System.out.println("Insertion");
          insert(root, 10);
          inorder(root);
    }
}
