import java.util.Scanner;
class Strong
{
public static void main(String arg[])
{
Scanner sc= new Scanner(System.in);
System.out.println("enter the no");
int n=sc.nextInt();
boolean b=strong(n);
if(b==true)
System.out.println(n+"  is  strong nmber");
else
	System.out.println(n+"is not a strong number");
}
 static boolean  strong(int n)
{
	int sum=0, temp=n;
	do {
		int r=n%10;
		int f=1;
		while(r>0)
		{ 
	f=(f*r);
	r--;
	}
	sum=sum+f;
	n=n/10;
	}while (n!=0);
	
	return sum==temp;
	
}
	}
