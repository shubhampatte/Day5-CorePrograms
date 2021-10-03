public class largestNum
{
	public static void main(String args[])
	{

		int a = Integer.parseInt(args[0]);
		System.out.println("FirstNumber is  :  " +a);
		
		int b = Integer.parseInt(args[1]);
		System.out.println("SecondNumber is : " +b);
		
		int c = Integer.parseInt(args[2]);
		System.out.println("ThirdNumber is  :  " +c);


		
		
		if  ((a > b) && (a > c)) 
		{
		
			System.out.println("Number is greater : " +a);
		}
		
		else if (b > c)			
		{
			System.out.println("Number is greater : " +b);
		}
		
		else	
		{    
			System.out.println("Number is greater : " +c);
		}		
			
			
	}

}
