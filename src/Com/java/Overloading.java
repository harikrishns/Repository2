package Com.java;

public class Overloading {


		public int sum(int x, int y)
		{
			return (x+y);
		}
		public int sum(int x,int y, int z)
		{
			return(x+y+z);
		}
		
		public double sum(double x, double y)
		{
			return(x+y);
			
		}
		public static void main(String[] args) {
		
		Overloading ov = new Overloading();
	 System.out.println(ov.sum(10,20));
	 System.out.println(ov.sum(10,20,30));
	 System.out.println(ov.sum(10.50,20.30));
		}
	
	}


