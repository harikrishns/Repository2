package Com.Practice;

import java.util.Scanner;

public class Swapwithout3rdVarible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b;
		System.out.println("Enter a and b values;");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Before swapping:"+a+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping:"+a+b);
		
	}

}
