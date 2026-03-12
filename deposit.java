package assignment2;
class Deposit
{
	long principal;
	int time;double rate, total;
	Deposit()
	{
		principal=123;
		time=12;
		rate=154.45;
	}
	Deposit(long principal, int time, double rate)
	{
		this.principal=principal;
		this.time=time;
		this.rate=rate;
	}
	Deposit(long principal,int time)
	{
		this.principal=principal;
		this.time=time;
		this.rate=2.5;
	}
	Deposit(long principal, double rate)
	{
		this.principal=principal;
		this.rate=rate;
		this.time=2;
	}
	void display()
	{
		System.out.println("principal: "+principal+" rate: "+rate+" time: "+time);
 	}
    void cal_amt()
    {
    	total=principal+(principal*rate*time)/100;
    }
}
public class deposit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deposit d1= new Deposit();
		d1.display();d1.cal_amt();
		
		System.out.println("2nd:-");
		Deposit d2= new Deposit(3000,10,2);
		d2.display();d2.cal_amt();
		
		System.out.println("3rd:-");
		Deposit d3= new Deposit(1200,5,4);
		d3.display();d3.cal_amt();
		
		System.out.println("4th:-");
		Deposit d4= new Deposit(11230,2,5);
		d4.display();d4.cal_amt();
	}

}

