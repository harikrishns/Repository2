package Com.java;

public class CountOCcurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s="java programming is very difficult";
	int normalcount=s.length();
	int normalcount_withouta=s.replace("a","").length();
	int count=normalcount-normalcount_withouta;
	System.out.println("a is occured:"+count);

	}

}
