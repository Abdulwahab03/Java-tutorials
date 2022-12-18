package operators_tutorial;
                                /*operators.
 Java supports 4 operators number 1 = Arithmetic operators, 2 = bitwise operators 
3 = logical operators 4 =relational operators */

                                         //Arithmetic operators
public class BasicOperator {

	public static void main(String[] args) {
		
		//Arithmetic operators using integer and double
		/* int x = 1+1;
		 int y = x+4;
		 double z  = y/5;
		 double e = z-x;
		 
		 System.out.println("the value of x =" +x);
		 System.out.println("the value of y = " +y);
		 System.out.println("the value of z = " +z);
		 System.out.println("the value of e = " +e); */
		
		              
		                                    //Example 2 (Modulus Arithmetic Operator)
		// The modulus operator returns the remainder of division operation it can be applied to floating-point types or Integers
		
		/*int ab = 4;
		 double xy = 24.32;
		 System.out.println("ab modulus 10 = " + ab % 10);
		 System.out.println("xy modulus 10 = " + xy % 10); */
		
		 
	                                     //Example3 (Increment and Decrement Arithmetic operator )
		/* The increment operator(++) increases its operand by 1 while the decrement operator(--) decreases its operand by 1
		 this two operators can be represented in post-fix and prefix position i.e post-fix = x++ or x-- ;prefix = ++x or --x */
		
		int b = 2;
		int c = 4;
		int d;
		int e;
		d = ++b;  // b = ++b d = b
		e = c++; // e = c , c = c++
		d++;
		
		System.out.println("the value of b = " +b);
		System.out.println("the value of c==" +c);
		System.out.println("the value of d = " +d);
		System.out.println("the value of e = " +e); 
		

  }
}

           