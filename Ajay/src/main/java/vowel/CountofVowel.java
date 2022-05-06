package vowel;
import java.util.Scanner;
public class CountofVowel {
	public static int count_v(String b) {
		int c=0;
		for(int i=0;i<b.length();i++)
		{
			if(b.charAt(i)=='a' || b.charAt(i)=='e' || b.charAt(i)=='i' || b.charAt(i)=='o' || b.charAt(i)=='u' ||
			b.charAt(i)=='A' || b.charAt(i)=='E' || b.charAt(i)=='E' || b.charAt(i)=='I' || b.charAt(i)=='O' || b.charAt(i)=='U')
			{
				System.out.println("The vowel present in the string is " +  b.charAt(i));
				c++;
			}
			
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string ");
		String a = sc.nextLine();
		System.out.println("No of vowels in the string " + count_v(a));

	}
	

}
