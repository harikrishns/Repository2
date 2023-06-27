package Com.java;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer>marks=new HashMap<String,Integer>();
		marks.put("Naveen", 100);
		marks.put("Tom", 200);
		marks.put("Lisa", 300);
		marks.put("peter", 400);
		marks.put("Nave", 600);
		marks.put(null, 500);
marks.put(null, 700);
marks.put("Nav",900);
System.out.println(marks);
System.out.println(marks.get("Lisa"));

	}

}
