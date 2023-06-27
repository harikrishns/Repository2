package Com.java;

import java.util.Arrays;

public class StringComaparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pwd="Hari123";
		System.out.println("pwd is:"+pwd);
		char[] c=new char[] {'H','a','r','i','1','2','3'};
		System.out.println("Password is:"+ c);
		Arrays.fill(c,'*');
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]);
		}
	}

}
