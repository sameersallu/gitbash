package numberprograms;

public class Smallestandlargestprimenum {

	
	public static void main(String[] args) {
		int sum=0;
		int lower =1;
		int upper = 20;
		for(int j=lower;j<=upper;j++)//smallestprime
		//for(int j=upper;j!=lower;j--)//largestprimenumber
		{
			if(prime(j)) {
				sum=sum+j;//sum of smallest largest prime numbers
			//System.out.println("It is a Smallestnum "+j);
			//	System.out.println(j+" largest primenum");
			break;
			
		}
		
		}for(int j=upper;j!=lower;j--)
		{
			if(prime(j))
			{
				sum=sum+j;
				break;
			}
			
		}
		System.out.println(sum);
		
	}
		

	public static boolean prime(int num) {
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
			
		}if(count==2) {
			return true;
		}
		return false;
	}
	
}
