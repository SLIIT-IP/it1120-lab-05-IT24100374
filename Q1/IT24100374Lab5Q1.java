import java.util.Scanner;

  public class IT24100374Lab5Q1{
    public static void main(String[]args){
      
	 //Declare
     int firstNo,secondNo,thirdNo,largeNo,smallNo;
	 
	 //Creating a object to read
	 Scanner input = new Scanner (System.in);
	 
	 //Input Number one
	 System.out.print("Enter the first integer: ");
	 firstNo = input.nextInt();
	 
	  //Input Number two
	 System.out.print("Enter the second integer: ");
	 secondNo = input.nextInt(); 
	 
	 //Input Number three
	 System.out.print("Enter the third integer: ");
	 thirdNo = input.nextInt();
	 
     //add a blank line and display the user enterd numbers
     System.out.println();
	 System.out.println("User entered numbers are: " + firstNo + " " + secondNo + " " + thirdNo);
	  
	 //Initialize the numbers
	 smallNo= firstNo;
	 largeNo= thirdNo; 
	  
	 //check smallest number
     if (secondNo<smallNo)
	    {
		     smallNo=secondNo;
		}

		 if (thirdNo < smallNo)
		{
			smallNo=thirdNo;
	    }

        //check largest number
		if (secondNo>largeNo)
		{
			largeNo=secondNo;
		}


		if (firstNo > largeNo)
		{
		   largeNo=firstNo;
	    }
        
	   //Print the smallest and largest number 
    System.out.println("The Smallest number: " + smallNo);
	System.out.println("The Largest number: " + largeNo);
  }
}