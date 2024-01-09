package Assignment3;

public class Web extends Account  implements User {
	@Override
	public void transfer(double amt,int choice)
	{
		if(choice==1)
		{
			withdraw(amt);
			
		}
		else 
		{
			deposit(amt);
		}
	}
}
