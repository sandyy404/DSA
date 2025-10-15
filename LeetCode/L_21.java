public class L_21 {
       static class Node {
        int val;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }



public Node addTwoNumbers(Node l1, Node l2) {
   Node l3  = new Node(0);
   while(l1 != null && l2 !=null){
      l3.val = l1.val + l2.val;
      if(l3.val > 9){
        l3.val = l3.val - 10;
      }
      l3.val++;
      l1 = l1.next;
      l2 = l2.next;
   }
        return l3;
    }
}
