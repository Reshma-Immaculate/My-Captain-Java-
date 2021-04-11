import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,temp,r,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		number = sc.nextInt();
		temp=number;
		while(temp>0) {
			r=temp%10;
			sum=(sum*10)+r;
			temp=temp/10;
		}
		if(number==sum) {
			System.out.println(number+" is a palindrome");
		}
		else {
			System.out.println(number+" is not a palindrome");
		}
		sc.close();

	}

}
