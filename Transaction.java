package Assignment3;

public class Transaction {
	User u1;
	public User ObjectCreation(int atmpin)
	{
		if(atmpin==1234)
		{
			System.out.println("object of atm is created");
			User u1=new Atm();
			return u1;
		}
		else
		{
			User u1=new Web();
			System.out.println("object of web is created");
			return u1;
		}
	}
}
