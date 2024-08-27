import java.util.Scanner;

  public class IT24100374Lab5Q2{
    public static void main(String[]args){
      
	  //Declare
     int NewM;
	 
	 //Creating a object to read
	 Scanner input = new Scanner (System.in);
	 
	 //Input Number one
	 System.out.print("Enter the number of new members introduced: ");
	 NewM = input.nextInt();
	 
     if (NewM<0)
     {
     //add a blank line and display the prize
     System.out.println();
	 System.out.println("Input must be a number 0 or greater");

     }else{

         //Finding the prize based on the number of new members using a switch statement
         String prize;
         switch(NewM){

            case 0:
            prize= "No prize";
            break;

            case 1:
            prize= "Pen";
            break;

            case 2:
            prize= "Umbrella";
            break;

            case 3:
            prize= "Bag";
            break;

            case 4:
            prize= "Travelling chair";
            break;

            default:
            prize= "Headphones";
         }

	   //Print the Prize
     System.out.println("Prize is: " + prize);

   }

  }
}