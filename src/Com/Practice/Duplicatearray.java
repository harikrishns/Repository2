package Com.Practice;

public class Duplicatearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,5,7,3,2,5,6};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			
			{
				if(arr[i]==arr[j])
				{
				System.out.println(arr[i]);
			}
		}
		

	}

}
}