class ArrayList1
{
	private int a[];
	private int index;
	private int size;
	private int Size;
	ArrayList1(int size)
	{
		a=new int[size];
		this.size=size;
		index=-1;
		Size=size;
	}
	public void add(int data)
	{
		if(index==size-1)
		{
			int temp[]=a;

			this.size=this.size+this.size/2;

			a=new int[this.size];
			for(int i=0;i<=index;i++)
				a[i]=temp[i];
			index++;
			a[index]=data;
		}
		else{
			index++;
		  a[index]=data;}
	}
	public void traverse()
	{
		if(index==-1)
		{
			System.out.print("empty");
		}
		else{
		for(int i=0;i<=index;i++)
			System.out.print(a[i]+" ");
	}}
	public void remov(int pos)
	{
		for(int i=pos;i<=index;i++)
		{
			a[i]=a[i+1];
		}
		a[index]=0;
		index--;
	}
	public void remall()
	{
		
		a=new int[Size];
		index=-1;
	}
	public int get(int pos)
	{
		if(pos<=index)
		{
			return a[pos];
		}
		else
			return -1;
	}
}
public class dynarray {

	public static void main(String[] args) {
     
		ArrayList1 l1= new ArrayList1(5);
		for(int i=1;i<=5;i++)
			l1.add(i*10);
		l1.add(5);
		l1.traverse();
		System.out.println();
		l1.remov(3);
		l1.traverse();
		System.out.println();
		l1.add(7);
		l1.traverse();
		l1.remall();
		System.out.println();
		l1.traverse();
		System.out.println();
		l1.add(7);
		l1.traverse();
		System.out.println();
		l1.add(8);
		l1.traverse();System.out.println();
		System.out.println(l1.get(1));
	}

}