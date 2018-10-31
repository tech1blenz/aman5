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
public class Stack
{
    class Q
    {
     private Node head;
     private Node tail;
     private int v;
     private int c;
     public void enQ(int d)
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
     public int deQ()
     {
         if(isEmpty()==true)
         {
             System.out.print("Queue is Empty");
         }
         else
         {
             v=head.data;
             head=head.next;
         }
         c--;
         return v;
     }
     public boolean isEmpty()
     {
         if(head==null)
             return true;
             return false;
     }
     public int size()
     {
         return c;
     }
    }
     Q q1 =new Q();
     Q q2 = new Q();
    public void push(int x)
    {
        q1.enQ(x);
    }
    public int pop()
    {
        while(q1.size()!=1)
        {
            q2.enQ(q1.deQ());
        }
        int t=q1.deQ();
        Q q=q1;
        q1=q2;
        q2=q;
        return t;
}
    public static void main(String g[])
    {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println("Displayed Stack:");
        System.out.print(s.pop()+" ");
        System.out.print(s.pop()+" ");
        System.out.print(s.pop()+" ");
        System.out.print(s.pop()+" ");
        }
}