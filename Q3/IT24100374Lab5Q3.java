import java.util.Scanner;

  public class IT24100374Lab5Q3{
    public static void main(String[]args){
      
	  //Declare
     int startDate,endDate,NOD; //NOD = NoOfDays
     double discount,TotalA,TCBD,DiscountA; //TotalCostBeforeDiscount, DiscountAmount
     int Roomcharge= 48000;
	 
	 //Creating a object to read
	 Scanner input = new Scanner (System.in);
	 
	 //Input Start date and End date 
	 System.out.print("Enter the start date (day) of reservation: ");
	  startDate = input.nextInt();

     System.out.print("Enter the end date (day) of reservation: ");
	  endDate = input.nextInt();

     // Validate the input dates
     if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {

        //error output
         System.out.println("Enter Start Date (1-31): "+ startDate);
         System.out.println("Enter End Date (1-31): " + endDate);
         System.out.println("Error: Dates must be between 1 and 31.");

     } else if (startDate>= endDate){

        //error output
         System.out.println("Enter Start Date (1-31): "+ startDate);
         System.out.println("Enter End Date (1-31): " + endDate);
         System.out.println("Error: Start date must be less than end date.");

     }else{

        //calculate the number of days reserved
        NOD = endDate - startDate;
        discount = 0;

         /*  Determine the discount based on the number of days
         If NoOfDays greater or equal to 3 AND less or equal to 4 discount = 10
         ElseIf NoOfDays is greater or equal than 5 dicount = 20 */
         if (NOD >= 3 && NOD <= 4) {
            discount = 10;
         } else if (NOD >= 5) {
            discount = 20;
         } 
         

         // Calculate the total amount 
         //TCBD=TotalCostBeforeDiscount, DiscountA= DiscountAmount
         TCBD = NOD * Roomcharge;
         DiscountA = TCBD * (discount / 100);
         TotalA = TCBD - DiscountA; 
        
	    System.out.println("Enter Start Date (1-31): "+ startDate);
        System.out.println("Enter End Date (1-31): "+ endDate);
        System.out.println();

        System.out.println("Room Charge Per A Day: Rs.48000.0/=");
        System.out.println("No. of Days reserved: " + NOD);
        System.out.println("Total amount to be paid: Rs " + TotalA); 
   }

  }
}



