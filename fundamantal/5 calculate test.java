import java.util.Scanner;

 class calculte
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		int remaining=0;
		for(int i=0;i<3;i++)
		{
           remaining=amount/10;
		   amount=amount-remaining;
		   System.out.println("remainng "+remaining);
		   System.out.println("amout "+amount);

		}
		System.out.println(amount);
	}
}