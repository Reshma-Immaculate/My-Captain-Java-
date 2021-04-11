import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,flag=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert any number");
		number = sc.nextInt();
		for(int i=2;i<=number/2;i++) {
			if(number%i==0) {
				flag=0;
				break;
			}				
	    }
		if(flag==1){
			System.out.println(number+" is a prime number");
		}
		else {
			System.out.println(number+" is not a prime number");
		}
	    sc.close();
	}

}
