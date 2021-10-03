public class evenOdd
{
	public static void main(String args[])
	{
		int a = Integer.parseInt(args[0]);
		System.out.println("Check for Even or Odd : " +a);
		
		if ( a % 2 == 0 )
		{
			System.out.println(+a+ " is even number");
		
		}
		else
		{
			System.out.println(+a+ " is odd number");
		}	
		
	}

	
}
