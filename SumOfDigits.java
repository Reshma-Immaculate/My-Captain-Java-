import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,temp,r,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		number = sc.nextInt();
		temp=number;
		while(temp>0) {
			r=temp%10;
			sum+=r;
			temp=temp/10;
		}
		System.out.println("The sum of the digits of "+number+" is "+sum);
		sc.close();
	}

}
