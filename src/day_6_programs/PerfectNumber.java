package day_6_programs;
import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int sum=0;
		System.out.println("Enter any number");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		r.close();
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
			if(n==sum) {
				System.out.println("Perfect Number");
			}
			else {
				System.out.println("Not Perfect Number");
			}
			
		}

	}


