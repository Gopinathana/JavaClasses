package org.comloop;

public class PrimedPro {

	
	public static void printStars(int n)
    {
        int i, j;
 
        // outer loop to handle number of rows
        //  n in this case
        for(i=0; i<n; i++)
        {
 
            // inner loop to handle number spaces
            // values changing acc. to requirement
            for(j=2*(n-i); j>=0; j--)
            {
                // printing spaces
                System.out.print(" ");
            }
            
            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for(j=0; j<=i; j++)
            {
                // printing stars
                System.out.print("* ");
            }
             
            // ending line after each row
            System.out.println();
        }
    }
	
	 public static void printNums(int nu)
	    {
	        int i, j,num;
	 
	        // outer loop to handle number of rows
	        //  n in this case
	        for(i=0; i<nu; i++)
	        {
	            // initialising starting number
	            num=1;
	 
	            //  inner loop to handle number of columns
	            //  values changing acc. to outer loop
	            for(j=0; j<=i; j++)
	            {
	                // printing num with a space
	                System.out.print(num+ " ");
	 
	                //incrementing value of num
	                num++;
	            }
	 
	            // ending line after each row
	            System.out.println();
	        }
	    }
 
    // Driver Function
    public static void main(String args[])
    {
        int n = 5;
        printStars(n);
        
        int nu = 5;
        printNums(nu);
    }
}

