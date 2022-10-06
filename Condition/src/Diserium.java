import java.util.Scanner;
class Diserium
{
public static void main(String arg[])
{
Scanner sc= new Scanner(System.in);
System.out.println("enter the no");
int n=sc.nextInt();
boolean b= isdiserium(n);
if (b==true)
System.out.println(n+ "is  a diserium");
else
	System.out.println(n+ "is not a diserium");
}

static boolean isdiserium(int n)
{
int dc=countdigit(n);
int sum=0, temp=n;
do {
	int r= n%10;
	sum = sum+pow(r,dc);
	dc--;
	n=n/10;
}while(n!=0); 
return sum==temp;
}

static int countdigit(int x)
{
	int count =0;
do {
count++;
x=x/10;
}while(x!=0);
	return count;
}	

	static int pow(int n,int m)
	{
int pw=1;
while(m>0) {
	pw=pw*n;
m--;
}
return pw;
}
}