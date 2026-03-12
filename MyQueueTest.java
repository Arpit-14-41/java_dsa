package tdsa;
import java.util.*;
class MyQueue
{
	int front,rear;
	final int max;
	int arr[];
	MyQueue(int size)
	{
		max=size;
		front=-1;
		rear=-1;
		arr=new int[max];
	}
	void enqueue(int ele)
	{
		if(rear== max-1)
		{
			System.out.println("q overflow");
			return;
		}
		if(front==-1)
		{
			front=0;
		}
		rear++;
		arr[rear]=ele;
		System.out.println(ele+"element push");
	}
	void deque()
	{
		if(rear==-1)
		{
			System.out.println("q under flow");
			return;
		}
		rear--;
		System.out.println("delete element="+arr[rear]);
		
	}
	void peek()
	{
		if(rear==-1)
		{
			System.out.println("q under flow");
			return;
			
		}
		rear--;
		System.out.println("top element"+arr[rear]);
	}
	void display()
	{
		for (int i = front; i >=0; i--) {
			System.out.println(arr[i]);
		}
	}
}

public class MyQueueTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj= new Scanner(System.in);
		MyQueue a= new MyQueue(5);
		while (true) {
			System.out.println("enter your choice \n 1.push \n 2.pop \n 3.peek \n 4.Display \n 5.exit");
			int ch=obj.nextInt();
			switch (ch) {
			case 1:
				System.out.println("enter the element");
				a.enqueue(obj.nextInt());
				break;
			case 2:
				System.out.println("pop");
				a.deque();
				break;
			case 3:
				System.out.println("peek");
				a.peek();
				break;
			case 4:
				System.out.println("display");
				a.display();
				break;
			case 5:
				System.exit(0);
				System.out.println("stopped");
			default:
				System.out.println("invalid choice");
				break;
			}
		}

	}

}
