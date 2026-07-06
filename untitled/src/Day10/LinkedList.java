package Day10;
import java.util.*;
public class LinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    Node tail;
    int size;
    public  void insert(int data){
        Node n=new Node(data);
        if(head==null){
            head=tail=n;
        }
        else{
            tail.next=n;
            tail=n;
        }
        size++;
    }
    public void insertatbegin(int data){
        Node n=new Node(data);
        n.next=head;
        head=n;
    }
    public void insertpos(int pos,int data){
        Node n=new Node(data);
        Node temp=head;
        for(int i=1;i<pos;i++){
            temp=temp.next;
        }
        n.next=temp.next;
        temp.next=n;
    }
    public void deletatbegin(){
        Node temp=head;
        head=head.next;
        temp.next=null;
    }
    public void deletepos(int pos) {
        Node temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    public void deleteatlast(){
        Node temp=head;
        if(temp.next==null){
            head=null;
            return;
        }
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }

    public void dis(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList s=new LinkedList();
        s.insert(10);
//        s.insert(20);
//        s.insert(30);
//        s.insert(40);
//        s.insert(50);
        s.dis();
//        s.insertatbegin(100);
//        s.dis();
//        s.insertpos(3,300);
//        s.dis();
//        s.deletepos(2);
//        s.dis();
        s.deleteatlast();
        s.dis();

    }

}
