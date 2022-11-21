package JUnitTestPackage1;

import JUnitTestPackage1.JUnitFunction1;

public class JUnitFunction1 {
	void AddSum()
	{
	int n1 = 225, n2 = 115, sum;  
	sum = n1 + n2;  
	System.out.println("The sum of numbers is: "+sum);  
	}  
	void TestStringConcatenation1()
    {  
		   String s="Sachin"+" Tendulkar";  
		   System.out.println(s);  
    }  
	public static void main(String args[])   
	{  
		JUnitFunction1 ob = new JUnitFunction1();
		ob.AddSum();
		ob.TestStringConcatenation1();
		
	}

}
