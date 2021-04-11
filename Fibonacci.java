public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		a=0;
		b=1;
		System.out.print(a+" "+b);
		for(int i=2;i<50;i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		
	}

}
