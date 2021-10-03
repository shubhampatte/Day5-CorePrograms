public class harmonic
{
	public static void main(String args[])
	{

		int number = Integer.parseInt(args[0]);
		System.out.println("Number is :" +number);
		
			double harmonicnum = 0;
		 
			for (int i=1;i<=number;i++)
			{
				harmonicnum += (double) 1/number;
				System.out.println("Harmonic Numbers are : " +harmonicnum);
		    }	
	}

}
