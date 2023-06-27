package Com.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Secondhigheststrems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=Arrays.asList(0,4,3,2,4,40,63,54,67,23,40,40,42);
		int secH=list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
	System.out.println(secH);
	
	}
	

}
