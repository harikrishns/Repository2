package Com.java;

public class ArrayMissngNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int[] {1,2,3,4,5,9,6,8,10};
		int sum = (10*11)/2;
		int actualSum=0;
		for (int i=0;i<arr.length;i++)
		{
			actualSum = actualSum + arr[i];
		}
		System.out.println("Missing number is:"+(sum-actualSum));
		}
	}


