package tdsa;
import java.util.*;
class MyStack
{
	int top;
	final int max;
	int arr[];
	MyStack(int size)
	{
		max=size;
		top=-1;
		arr=new int[max];
	}
	void push(int ele)
	{
		if(top==max-1)
		{
			System.out.println("stack overflow");
			return;
		}
		top++;
		arr[top]=ele;
		System.out.println(ele+"element push");
	}
	void pop()
	{
		if(top==-1)
		{
			System.out.println("stack under flow");
			return;
		}
		System.out.println("delete element="+arr[top]);
		top=top-1;
	}
	void peek()
	{
		if(top==-1)
		{
			System.out.println("stack under flow");
			
		}
		System.out.println("top element"+arr[top]);
	}
	void display()
	{
		for (int i = top; i >=0; i--) {
			System.out.println(arr[i]);
		}
	}
}

public class MyStackTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj= new Scanner(System.in);
		MyStack a= new MyStack(5);
		while (true) {
			System.out.println("enter your choice \n 1.push \n 2.pop \n 3.peek \n 4.Display \n 5.exit");
			int ch=obj.nextInt();
			switch (ch) {
			case 1:
				System.out.println("enter the element");
				a.push(obj.nextInt());
				break;
			case 2:
				System.out.println("pop");
				a.pop();
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
			default:
				System.out.println("invalid choice");
				break;
			}
		}

	}

}
