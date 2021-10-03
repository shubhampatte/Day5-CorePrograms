public class alphabet
{
	public static void main(String args[])
	{

		String s = args[0];
		char ch = s.charAt(0);
		System.out.println("Alphabet entered is : " +ch);
		
		if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )      
		{
			
			System.out.println(ch+ " is VOWEL ");
		}
		else
		{
			System.out.println(ch+ " is CONSONANT ");
		}	
	}

}
