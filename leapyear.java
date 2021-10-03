public class leapyear
{
	public static void main(String args[])
	{

		int num = Integer.parseInt(args[0]);
		System.out.println("year entered :" +num);
		
		if ( ((num % 4 == 0) && (num % 100!=0)) || (num % 400 == 0) )
		{
			System.out.println(+num +" is a leap year");
		}
		else
		{
			System.out.println(+num +" is not a leap year");
		}	
	}

}
