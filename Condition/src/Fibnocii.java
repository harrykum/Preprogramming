
public class Fibnocii {
public static void main(String[] args) {
	int term,a=0,b=1,c;
	 term=8;
	for(int i=1; i<=term;i++) {
		System.out.println(a+" ");
		c=a+b;
		a=b;
		b=c;
	}
}
}
