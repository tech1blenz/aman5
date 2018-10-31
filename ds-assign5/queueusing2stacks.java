import java.util.*;
class StacksEmptyException extends Exception
{
    StacksEmptyException(String str)
    {
        super(str);
    }
}
 class Node
{
    int data;
    Node next;
    Node(int data)
    {
      this.data=data;
      this.next=null;
    }
}
public class QueueUsingStacks
{
   class Stack
    {
    private Node head;
    private int val;
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
    }
    public int pop()
    {
        if(head==null)
        {
            System.out.println("Stacks are Empty");
        }
        else
        {
            val=head.data;
            head=head.next;
        }
        return val;
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
    }
    Stack s1=new Stack();
    Stack s2=new Stack();
    
    public void enqueue(int x)
    {
        s1.push(x);
    }
    public int dequeue()
    {
        int r=-1;
        if(s1.isEmpty())
        {
            System.out.println("Stack is Empty");
        }
        while(s1.isEmpty()==false)
        {
            r=s1.pop();
            s2.push(r);
        }
        if(!s2.isEmpty())
        {
            s2.pop();
        }
        while(s2.isEmpty()==false)
        {
            enqueue(s2.pop());
        }
        return r;
    }
    public static void main(String[] args)
    {
        QueueUsingStacks q=new QueueUsingStacks();
            q.enqueue(1);
            q.enqueue(2);
            q.enqueue(3);
            q.enqueue(4);
            System.out.println("Displayed Queue:");
            System.out.print(q.dequeue()+" ");
            System.out.print(q.dequeue()+" ");
            System.out.print(q.dequeue()+" ");
            q.enqueue(5);
            q.enqueue(6);
            q.enqueue(7);
          System.out.print(q.dequeue()+" ");
          System.out.print(q.dequeue()+" ");
          System.out.print(q.dequeue()+" ");
          System.out.print(q.dequeue()+" ");
}
            

 }