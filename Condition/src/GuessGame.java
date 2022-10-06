import java.util.Scanner;
class GuessGame {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Guess the number 0 to 9");
		int n=sc.nextInt();
		int r=sc.nextInt();
		if (r==n)
			System.out.println("you won the game");
		else {
			System.out.println("sorry it was wrong");
		}
	}
}