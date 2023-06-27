package Com.Practice;

public class ReverseStringWousingInbuiltMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="harikrishna";
		char [] ch=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}

	}

}

/*
 String str;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter your string");
 str=in.nextline();
 String[] token=str.split("");
 for(int i=token.length-1;i>=0;i--);
 {
 System.out.println(token[i]+" ")
 
*/