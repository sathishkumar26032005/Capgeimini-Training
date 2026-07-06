package Day12;

public class StackUsingLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        Node top=null;
        int size=0;
        public void push(int data){
            Node n=new Node(data);
            if(top==null){
                top=n;
            }
            else {
                n.next=top;
                top=n;
            }
            size++;
        }
        public void pop(){
            if(top==null){
                System.out.println("Stack is Empty");
                return;
            }
            System.out.println(top.data+" is remove in the stack");
            top=top.next;
            size--;
        }
        public void peek(){
            if (top==null){
                System.out.println("Stack is Empty");
                return;
            }
            System.out.println(top.data+" Peek Element");
        }

        public void display(){
            if(top==null){
                System.out.println("Stack is Empty");
                return;
            }
            Node temp=top;
            while (temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
        public static void main(String[] args) {
            StackUsingLinkedList st=new StackUsingLinkedList();
            st.push(10);
        }

}
