public class flipCoin
{
	public static void main(String args[])
	{

		int number = Integer.parseInt(args[0]);
		
		System.out.println("Number : " +number);
		
		int head = 0;
		int tail = 0;
		
		for (int i=0;i<number;i++)
		{			
			int toss = (int) (Math.random() * 10) % 2;
			System.out.println("Toss : " +toss);
			
			if ( toss == 1)
			{
				System.out.println("Head" );
				head += 1;
				System.out.println("No of heads : " +head);
			}
			else
			{
				System.out.println("Tail");
				tail += 1;
				System.out.println("No of Tails : " +tail);
			}
			
		int percentageHead = (head*100)/number;
		int percentageTail = (tail*100)/number;
		System.out.println("Percentage of head :" +percentageHead);
		System.out.println("Percentage of tail : " +percentageTail);

		}
	}

}
