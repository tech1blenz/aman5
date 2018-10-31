import java.util.*;
class Node
{
    Node next;
    int data;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class Stack
{
    private Node head;
    private int c;
    public void push(int d)
    {
        Node n=new Node(d);
        if(head==null)
        {
            head=n;
        }
        else
        {
            n.next=head;
            head=n;
        }
        c++;
    }
    public int pop()
    {
        if(isEmpty()==true)
        {
            System.out.println("Stack is Empty");
        }
            int val=head.data;
            head=head.next;
        c--;
        return val;
    }
    public int top()
    {
        return head.data;
    }
    public int size()
    {
        return c;
    }
    public boolean isEmpty()
    {
        if(head==null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void printStack()
    {
        Node t=head;
        while(t!=null)
        {
            System.out.print(t.data+" ");
            t=t.next;
        }
    }
}
    class Queue
{
    private Node head;
    private Node tail;
    private int c;
    public void in(int d)
    {
        Node n=new Node(d);
        if(head==null)
        {
            head=tail=n;
        }
        else
        {
            tail.next=n;
            tail=n;
        }
        c++;
    }
    public int out()
    {
        if(isEmpty()==true)
        {
            System.out.println("Queue is Empty");
        }
          int val=head.data;
            head=head.next;
            c--;
        return val;
    }
    public int top()
    {
        return head.data;
    }
    public int size()
    {
        return c;
    }
    public boolean isEmpty()
    {
        if(head==null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void printQueue()
    {
        Node t=head;
        while(t!=null)
        {
            System.out.print(t.data+" ");
            t=t.next;
        }
    }
}
public class StackandQueue
{
    public static void main(String a[])
    {
        Stack st=new Stack();
        Queue q = new Queue();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        q.in(10);
        q.in(13);
        q.in(17);
        q.in(18);
        q.in(1);
        q.in(100);
        System.out.println("Stack Implementation");
        System.out.println("Size of stack : "+st.size());
        System.out.println("Element popped : "+st.pop());
        System.out.println("Current size of stack : "+st.size());
        st.push(20);
        System.out.println("Last Element Entered : "+st.top());
        System.out.println("Elements Present in Stack : ");
        st.printStack();
         System.out.println();
         System.out.println("Element popped : "+st.pop()+" ");
          System.out.println("Element popped : "+st.pop()+" ");
           System.out.println("Element popped : "+st.pop()+" ");
           System.out.println("---------------------------------");
           System.out.println("Queue Implementation");
           System.out.println("Size of Queue : "+q.size());
          System.out.println("Elements Present in Queue : ");
        q.printQueue();
         System.out.println();
         System.out.println("Element Removed : "+q.out()+" ");
         System.out.println("Element Removed : "+q.out()+" ");
           System.out.println("Size of Queue : "+q.size()); 
             System.out.println("Top Element of queue : "+q.top()); 
            System.out.println("Elements Present in Queue : ");
        q.printQueue();
    }
}