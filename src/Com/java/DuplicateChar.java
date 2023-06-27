package Com.java;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="harikrishna";
		int length=s.length();
		char[] ch=s.toCharArray();
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println("duplicate char is:"+ch[i]);
				
					break;
				}
			}
		}
	}

}
