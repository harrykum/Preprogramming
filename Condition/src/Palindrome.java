import java.util.Scanner;
class Palindrome
{
	public static void main(String arg[])
	{
	Scanner sc = new Scanner(System.in); 
	System.out.println("Enter the number");
	int n = sc.nextInt();
	int temp = n;
	int rev = 0; 
	while(n!=0)
	{
	int r = n%10;
	rev = rev*10+r;
	n = n/10;
	}
	if(temp==rev)
	{
	System.out.println("It's palindrome");
	}
	else
	{
	System.out.println("not palindrome");
	}
}
}