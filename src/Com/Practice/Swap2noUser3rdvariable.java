package Com.Practice;

import java.util.Scanner;

public class Swap2noUser3rdvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,temp;
System.out.println("Enter a and b values:");
		Scanner sc=new Scanner(System.in);
	
	a=sc.nextInt();
	b=sc.nextInt();
	System.out.println("Before swaping"+a+b);
	temp=a;
	a=b;                                                                                                                                                                                                   
	b=temp;
	System.out.println("After swapping:"+a+b);
	
	}

}
