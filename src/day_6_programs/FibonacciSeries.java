package day_6_programs;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		System.out.print(a+" "+b);
		int c;
		for(int i=1;i<=10;i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			
		}

	}

}
