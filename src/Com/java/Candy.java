package Com.java;

public class Candy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int[] candies = {1 , 4 , 5 , 6 , 7};
		        int extraCandies = 5;
		        for(boolean x : kidsWithCandies(candies , extraCandies))
		            System.out.print(x + " ");
		    }
		    static boolean[] kidsWithCandies(int[] candies , int extraCandies)
		    {
		        int n = candies.length , maxCandies = 0;
		        for(int i = 0 ; i < n ; i++)
		            if(candies[i] > maxCandies)
		                maxCandies = candies[i];
		        boolean[] result = new boolean[n];
		        for(int i = 0 ; i < n ; i++)
		            result[i] = (candies[i] + extraCandies >= maxCandies);
		        return result;
		    }
		}
