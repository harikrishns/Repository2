package Com.java;

public class RemoveSpecialchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hi@#how*&Are#$you#hari";
		s=s.replaceAll("[^a-zA-Z0-9]"," ");
		System.out.println(s);
	}

}
