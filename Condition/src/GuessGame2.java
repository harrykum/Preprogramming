import java.util.Scanner;
import java.util.Random;
class GuessGame2 {
	public static void main(String[] args) {
		Scanner kb= new Scanner(System.in);
		Random rd=new Random();
		
		while(true) {
		System.out.println("Guess the number 0 to 9");
		int n=kb.nextInt();
		int r=rd.nextInt();
		if (r==n)
			break;
		else if (n<r)
			System.out.println("you won the game");
		else 
			System.out.println("sorry it was wrong");
		}
	}
}
