package numberprograms;

public class spynumber {

	
	public static void main(String[] args) {
		int num=123;
		
		int sum=0;
		int product=1;

		while(num!=0)
		{
		int	rem=num%10;
			sum=sum+rem;
			product=product*rem;
			num=num/10;
			
		}
		if(sum==product)
		{
			System.out.println("it is spynumber");
		}else {
			System.out.println("not a spy number");
		}
	}
}
