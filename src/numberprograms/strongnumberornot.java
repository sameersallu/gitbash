package numberprograms;

public class strongnumberornot {

	
	public static void main(String[] args) {
		
		int num=145,num2=num;
		int sum=0;
		while(num>0)
		{
		int rem=num%10;
		int prod=1;
		for(int i=rem;i>0;i--) {
		prod=prod*rem;
		sum=sum+prod;
		}
		num=num/10;
		System.out.println(sum);
		}
	}
}
