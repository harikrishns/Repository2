package Com.java;

import java.util.Arrays;

public class Arraysorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array=new int [] {23,34,12,4,56,23,80,2,3};
		Arrays.sort(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}

}
