package Day12;
import java.util.*;
public class StackExample {

    private int[] stack;
    private int top;
    private int cap;
    public  StackExample(int size){
        this.cap=size;
        this.stack=new int[cap];
        this.top=-1;
    }
    public boolean isFull(){return top==cap-1;}
    public boolean isEmpty(){return top==-1;}
    public void push(int data){
        if(isFull()){
            System.out.println("Stack is Full");
            return;
        }
        else{
            stack[++top]=data;
            System.out.println(data+"insert in stack");
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        else{
            return stack[top--];
        }

    }
    public void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Stack Element are :");
        for(int i=top;i>=0;i--){
            System.out.println(stack[i]+" ");
        }
    }
    public static void main(String[] args) {
        StackExample st=new StackExample(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.display();
        st.pop();
        st.display();
    }
}
