package variable_lesson;

class VarLesson {

	public static void main(String[] args) {
	  /* int i, j, k;
	   
	    int d = 3;
		String animal = "Dog";
		
		double a = 3.0, b = 4.0;
		
	    //create a dynamic variable called c
		double c = Math.sqrt(a*a + b*b);
		System.out.println("the value of c is = " +c);  */
		
		
		            //Example2
		       // Top level variable
		 int x ;
		 for(x = 0 ; x < 3; x++) {
			 
			 int y = -1;
			 
			 System.out.println("y is equal to:" +y);
			 y = 100;
			 System.out.println("y is now equal "+y); 
			 
		 } 
		 
		 
		          //Example 3
		//int x ;// known to all code within main
		x = 10;
		if(x == 10) {
			int y =20; //known only inside if block
			System.out.println("x and y are:" +x +" "+ y );
			
		}
		//y = 100; // Error y not known here
		//but x is still known
	   System.out.println("x is:" + x); 
		
   }  
	
}
