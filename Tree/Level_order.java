

import java.util.ArrayList;

class Node {

    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Level_order {

    public static void levelOrderRec(Node root, int level, ArrayList<ArrayList<Integer>> res) {
        if (root == null) {
            return;
        }
        if (res.size() <= level) {
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.data);
        levelOrderRec(root.left, level + 1, res);
        levelOrderRec(root.right, level + 1, res);
    }

    public static ArrayList<ArrayList<Integer>> levelorder(Node root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        levelOrderRec(root, 0, res);
        return res;
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(12);
        root.right = new Node(13);
        root.left.left = new Node(7);
        root.left.right = new Node(14);
        root.right.left = new Node(2);
        root.right.right = new Node(17);
        ArrayList<ArrayList<Integer>> res = levelorder(root);
        for (ArrayList<Integer> level : res) {
            for (int val : level) {
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
