import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		System.out.println("You have choices\t1.Hey\t2.Hi\t3.Hello");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		switch(choice)
		{
		case 1: System.out.println("Hey");
		break;
		case 2: System.out.println("Hi");
		break;
		case 3: System.out.println("Hello");
		break;
		default: System.out.println("Invalid choice");	
		}
	}

}
