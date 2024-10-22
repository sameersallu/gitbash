package numberprograms;

public class Armstrongnum {

	static int count=0;
	 static int sum=0;
	
public static void main(String[] args) {
	
	int num=153,num2=num;
	
	while(num>0) {
		num=num/10;
		count++;
	}
	
	while(num2>0) {
		int rem =num2%10;
		int prod=1;
		for(int i = 1;i<=count;i++) {
			prod=prod*rem;
		}
		sum=sum+prod;
		num2=num2/10;
	}
	System.out.println(sum);
	
	
}
}
