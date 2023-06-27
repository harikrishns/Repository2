package Com.java;
public class FinallyBlock4 {
void m1()
{ 
  int a = 20, b = 0;	
  try {
     System.out.println("I am in try block");
     int c = a/b;
     System.exit(0);
     System.out.println("Result: " +c);
  }
  catch(ArithmeticException ae)
  {
    System.out.println("I am in catch block");
  }
  finally 
  {
    System.out.println("I am in finally block");	
  }
  System.out.println("Statement after finally block");
}
 public static void main(String[] args) 
 {
 FinallyBlock4 obj = new FinallyBlock4();
  obj.m1();
  }
}