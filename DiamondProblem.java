package basicprograms;
interface DiamondIn  
{   
//default method   
default void display()   
{   
System.out.println("The display() method invoked....");   
}   
}   
//interface without default method  
interface DiamondInterface1 extends DiamondIn  
{   
      
}   
//interface without default method  
interface DiamondInterface2 extends DiamondIn  
{  
      
}   
public class DiamondProblem implements DiamondInterface1, DiamondInterface2  
{   
	public static void main(String args[])   
	{   
		DiamondProblem diamond = new DiamondProblem();   
		//calling method  
		diamond.display();   
	}   
}  