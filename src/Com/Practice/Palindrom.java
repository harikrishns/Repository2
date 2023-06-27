package Com.Practice;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madam";
		String x="";
		for(int i=s.length()-1;i>=0;i--)
		{
			x=x+s.charAt(i);
		}
			if(s.equals(x))
			{
				System.out.println("string is pallindrome");
				
		}
			else {
				System.out.println("string is not pallindrome");
			}
		}
		
	}


