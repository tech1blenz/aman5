import java.util.*;
class StackEmptyException extends Exception
{
    StackEmptyException(String str)
    {
        super(str);
    }
}
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
public class MinStack
{
    private int minVal=10000;
    private Node head;
    public void push(int d)
    {
        Node n=new Node(d);
        if(n.data<minVal)
           minVal=n.data;
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
    public int pop()throws StackEmptyException
    {
        int val;
        if(isEmpty()==true)
        {
            throw new StackEmptyException("Stack is Empty");
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
    public void print()
    {
        Node t=head;
        while(t!=null)
        {
            System.out.print(t.data+" ");
            t=t.next;
        }
    }
    public static void main(String a[])throws StackEmptyException
    {
        MinStack st=new MinStack();
        st.push(12);
        st.push(23);
        st.push(3);
        st.push(40);
        st.push(5);
        st.print();
        System.out.println();
        System.out.println("Minimum Element : "+st.minVal);
    }
}