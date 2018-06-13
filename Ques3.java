import java.util.*;
class StrInt
{
	public static void Max(int a , int b)
	{
		if(a>b)
		{
			System.out.println(a+" is greater than "+b);
		}
		else if(a<b)
		{
			System.out.println(b+" is greater than "+a);
		}
		else
		{
			System.out.println(a+" and "+b+" are Equal");
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str , str1;
		int n1 , n2;
		System.out.println("Enter a number:");
		str = sc.next();
		System.out.println("Enter another number:");
		str1 = sc.next();
		
		n1 = Integer.parseInt(str);
		n2 = Integer.parseInt(str1);
		Max(n1,n2);
	}
}