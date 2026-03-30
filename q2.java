
import java.util.*;
public class q2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj= new Scanner(System.in);
		System.out.println("enter the range");
		int n=obj.nextInt();
		String a[]= new String[n];
		for (int i = 0; i < a.length; i++) {
			System.out.println("enter the colors");
			a[i]=obj.next();
		}
		
		//checking according to index point
		try {
			System.out.println("enter the index:");
			int k=obj.nextInt();
			System.out.println("colors:"+a[k]);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("array out of bound");
			System.out.println(e);
		}
		
		// checking whether the colors are present or not
		try {
			for (int j = 0; j < a.length; j++) {
				if (a[j] != null)
				{
					System.out.println("color:"+a[j]);
				}
			}
		} catch (Exception e1) {
			// TODO: handle exception
			System.out.println("color is not present at that index:");
			System.out.println(e1);
		}
		
		try {
			for (int j = 0; j < a.length; j++) {
				int b=Integer.parseInt(a[j]);
				System.out.println("enter the color inplace of number:"+a[j]);
			}
		} catch (Exception e2) {
			// TODO: handle exception
			System.out.println("(ALL THE ENTERS ARE FOR COLORS)");
			System.out.println(e2);
		}
		finally {
			System.out.println("------THNKS TO ENTER------");
		}
		obj.close();
	}
	}

