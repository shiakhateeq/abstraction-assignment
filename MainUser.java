package Assignment3;

public class MainUser
{
public static void main(String[] args) {
	Account a1=new Account("String name",1488101,"String ifsc","String branch");
	a1.deposit(1000.0);
	Transaction t1=new Transaction();
	User u1=t1.ObjectCreation(123);
	
	u1.transfer(10000,1);
	u1.transfer(2000.0,2);

	
	User u2=t1.ObjectCreation(1111);
	u1.transfer(300.0,2);
	u1.transfer(100.0,1);
	
	Account a2=new Account("String name1",14881021,"String ifsc","String brnch");
	a2.deposit(250000.0);
	
	 User u3=t1.ObjectCreation(1223);
	  
	 u3.transfer(10,1);
	 u3.transfer(5, 2);
	
}
}