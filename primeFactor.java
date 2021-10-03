public class primeFactor
{
	public static void main(String args[])
	{

		int value = Integer.parseInt(args[0]);
		System.out.println("Number : " +value);
		
		for (int i=1;i<=value;i++)
		{
			if (value % i == 0)
			{
				if(isPrime(i))
				{
					System.out.println("Factors :" +i);
				}	
			}
		}		
	}
		
	public static boolean isPrime(int value)
	{
		for (int i = 2;i<=Math.sqrt(value);i++)
		{
			if (value % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}

