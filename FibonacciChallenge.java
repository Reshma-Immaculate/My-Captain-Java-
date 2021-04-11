import java.util.Scanner;

public class FibonacciChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,count;
		a=0;
		b=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the fibonacci series ");
		count = sc.nextInt();
		System.out.print(a+" "+b);
		for(int i=2;i<count;i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
	    }
	    sc.close();
}
}