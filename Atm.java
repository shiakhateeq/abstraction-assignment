package Assignment3;

public class Atm extends Account  implements User 
{
@Override
	public void transfer(double amt,int choice) {
	if(choice==1)
	{
		deposit(amt);
	}
	else
	{
		withdraw(amt);
	}
	}
}

