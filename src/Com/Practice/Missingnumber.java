package Com.Practice;

public class Missingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= new int[]{1,2,3,4,6,7,8,9,10};
		int sum=(10*11)/2;
		int actualsum=0;
		for(int i=0;i<arr.length;i++)
		{
			actualsum=actualsum+arr[i];
		}
	
		System.out.println("Missing no is:"+(sum-actualsum));
		}
		

}


