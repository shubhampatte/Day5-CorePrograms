public class powerTwo
{
	public static void main(String args[])
	{

		int number = Integer.parseInt(args[0]);
		System.out.println("Number is :" +number);
		
		
		if ( (number >= 0) && (number < 31) ) 
		{
			for (int i=0;i<=number;i++)
			{
				int power = (int) Math.pow(2, i);
				System.out.println("Power of two is : " +power);
		    }
				
			
		}	
	}

}
