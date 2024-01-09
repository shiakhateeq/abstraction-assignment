package Assignment3;

public class Account {
String name;
long accno;
double bal;
String ifsc;
String branch;
 Account ()
 {
	 
 }
public Account(String name, long accno,String ifsc,String branch ) {
	super();
	this.name = name;
	this.accno = accno;
	
}

public void deposit(double amt) {

System.out.println("deposit amt ="+amt+";"+"current amt ="+amt);
}
public void withdraw(double amt)
{
	if(bal>amt)
	{
	
		System.out.println("withdraw amt="+amt+";"+"current amt ="+bal);
	}
	else
	{
		System.out.println("invalid transaction or insuff"
				+ "icent balance");
	}
}
public void showdetails()
{
	System.out.println(name);
	System.out.println(accno);
}
}
