import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,sum=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		number = sc.nextInt();
		for(int i=number;i>0;i--) {
			sum=sum*i;
		}
		System.out.println("The factorial of "+number+" is "+sum);
		sc.close();
	}

}
