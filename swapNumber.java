public class swapNumber
{
	public static void main(String args[])
	{
		int a = Integer.parseInt(args[0]);
		int b =Integer.parseInt(args[1]);
		System.out.println("Numbers to be swap: " +a+ " and " +b);
		
		int x;
		
		x=a;
		a=b;
		b=x;
		
		System.out.println("swapping numbers are : " +a+  " and " +b);
		


		
	}

}
