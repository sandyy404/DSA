// Stack Implementation Using LinedList

class Node {

    int data;
    Node next;

    public Node(int x) {
        data = x;
        next = null;
    }
}

class mystack {

    Node top;
    int count; //To Store current size of stack

    public mystack() {
        top = null;
        count = 0;
    }

    // push method
    public void push(int x) {
        Node temp = new Node(x);
        temp.next = top;
        top = temp;
        count++;
    }

    // pop method
    public int pop() {
        if (top == null) {
            System.out.println("Stack is underflow");
            return -1;
        }
        int val = top.data;
        top = top.next;
        count--;
        return val;
    }

    // peek method
    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    // isEmpty method
    public boolean isEmpty() {
        return top == null;
    }

    // size of stack
    public int size() {
        return count;
    }
}

// Stack Implementation Using Array
//  class  mystack {
//         private int[] arr;    // this will store the stack element
//         int top;    // this will give top element of the stack.
//         int capacity;  //  maximum size of stack
//         public mystack(int cap) {
//             capacity = cap;
//             arr = new int[capacity];
//             top = -1;
//         }
//         // push method
//         public void push(int x) {
//             if (top == capacity - 1) {
//                 System.out.println("Stack Overflow");
//                 return;
//             }
//             arr[++top] = x;
//         }
//         //pop method
//         public int pop() {
//             if (top == -1) {
//                 System.out.println("Stack Underflow");
//                 return -1;
//             }
//             return arr[top--];
//         }
//         // peek method
//         public int peek(){
//          if(isEmpty()){
//             System.out.println("Stack is empty");
//             return -1;
//          }
//          return arr[top];
//         }
//         //isEmpty method
//         public boolean isEmpty(){
//           return top==-1;
//         }
//         //full
//          public boolean full(){
//             return top==capacity-1;
//          }
//     }
public class A {

    public static void main(String[] args) {
        mystack ms = new mystack();
        ms.push(4);
        ms.push(2);
        ms.push(3);
        ms.push(65);
        ms.push(25);
        System.out.println("Popped " + ms.pop());
        System.out.println("top element " + ms.peek());
        System.out.println("Is this stack empty? " + ms.isEmpty());
          System.out.println(ms.size());

        // for linkedlist
    }
}
