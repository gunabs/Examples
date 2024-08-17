package example;

public class leedcode {

	public static void main(String[] args) {
		int a=17;
		int count=0;
		for(int i=2;i<a/2;i++)
		{
			
			if(a%i==0)
			{
				count++;
				break;
			}
			
		}
		if(count==0)
		{
			System.out.println("the num is prime no :"+a);
		}
		else
			System.out.println("the num is  not a prime no :"+a);

	}

}
