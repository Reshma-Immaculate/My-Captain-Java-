import java.util.Scanner;

public class MinutestoYearsandDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner object = new Scanner(System.in);
		int minutes = object.nextInt();
		object.close();
		int num1 = 365*24*60;
		int num2 = 24*60;
		int year = minutes/num1;
		int remainder = minutes%num1;
		int day = remainder/num2;
		System.out.println(minutes + " minutes is approximately " + year + " years and " + day + " days");

	}

}
