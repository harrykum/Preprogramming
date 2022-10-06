import java.util.Scanner;
import java.util.Random;
class GuessGame1 {
	public static void main(String[] args) {
		Scanner kb= new Scanner(System.in);
		Random rd=new Random();
		int count=3;
		int r=rd.nextInt(10);
		while(count>0) {
			count--;
		System.out.println("Guess the number 0 to 9");
		int n=kb.nextInt();
		
		if (r==n) {
			
			System.out.println("you won the game");
			return;
		}
		else if(n<r)
			System.out.println("it is less");
		else
			System.out.println("it is more");
		}
		System.out.println("you are unlucky");
	}
}
