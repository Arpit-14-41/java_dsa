package tdsa;
import java.util.*;
class MYCqueue
{
	int rear,front;
	final int max;
	int arr[];
	MYCqueue(int size)
	{
		max= size;
		rear=-1;front=-1;
		arr= new int[max];
	}
	void enqueue(int ele)
	{
		if((front==0 && rear==max-1)||(front==rear+1))
		{
			System.out.println("cq overflow");
			return;
		}
		if(front==-1)
			front=0;
		{
			if(rear==max-1)
			{
				rear=0;
			}
			else
			{
				rear++;
				arr[rear]=ele;
				System.out.println("element push successfully");
			}
		}
	}
		void deque()
		{
			if(front==-1)
			{
				System.out.println("cq underflow");
			}
			if(front==rear)
			{
				System.out.println("cq underflow");
			}
			front++;
			System.out.println("element deleted");
		}
	}

public class MYCqueueTest
{
	

}
