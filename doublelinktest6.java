import java.util.*;
class node
{
	int data;
	node next;
	node prev;
}
class new1
{
	static node head=null;
	static void create()
	{	
		Scanner sc = new Scanner(System.in);
		node ptr=null,cur=null;
		int c=0;
		char ch='y';
		while(ch=='y'){
			++c;
			cur=new node();
			System.out.print("Enter node"+c+" data: ");
			cur.data=sc.nextInt();
			cur.next=null;
			cur.prev=null;
			if(head==null){

				head=cur;
				System.out.println("C"+ head);
			}
			else{
				cur.prev=ptr;
				ptr.next=cur;
			}
			ptr=cur;
			System.out.print(ptr+ " Do you want to continue: ");
			ch=sc.next().charAt(0);
		}
	}
	static void displayForward()
	{
		  if(head==null)
		  {
		  	return ;
		  }
		node ptr=head;
				System.out.println("A"+ ptr);
		while (ptr!=null) {
			System.out.println("Forward"+ptr.data);
			ptr=ptr.next;
		}
	}
	static void displayBackward()
	{
		  if(head==null)
		  {
		  	return ;
		  }
		node ptr=head;
          System.out.println("B"+ ptr);
		while(ptr.next!=null)
		{
			ptr=ptr.next;
		}
		while (ptr!=null) {
			System.out.println("Backward"+ptr.data);
			ptr=ptr.prev;
		}
	}
	static void InsertBeg(int ele)
	{
		node cur=new node();
		cur.prev=null;
		cur.data=ele;
		cur.next=null;
		System.out.println(ele+"insert begin");
		if(head=null)
		{
			head=cur;
			return;
		}
		cur.next=head;
		head.prev=cur;
		head=cur;
	} 
	static void InsertEnd(int ele)
	{	
		node cur=new node();
		cur.prev=null;
		cur.data=ele;
		cur.next=null;
		System.out.println(ele+"insert end");
		if(head==null)
		{
			head=cur;
			return; 
		}
		node ptr=head;
		while (ptr!=null) {
			ptr=ptr.next;	
		}
		ptr.next=cur;
		cur.prev=ptr;
	}
	static void DeleteBeg()
	{
		if (head==nul) {
			System.out.println("no element found");
			return;
		}
		System.out.println("delete element="+head.data);
		if (head.next==null) {
			head=null;
			return;
		}
			head=head.next;
			head.prev=null;
	}
	static void DeleteEnd()
	{
		if (head==null) {
			System.out.println("no element found");
			return;
		}
		if(head.next==null)
		{
			System.out.println("delete element="+head.data);
			head=null;
			return;
		}
		while (ptr.next.next!=null) {
			ptr=ptr.next;
		}
		System.out.println("delete element:"+ptr.next.data);
		ptr.next=null;
	}
}
class tests
{
public static void main(String[] args) {
	new1.create();
	new1.displayForward();
	new1.displayBackward();
	new1.DeleteBeg();
	new1.DeleteEnd();
}
}