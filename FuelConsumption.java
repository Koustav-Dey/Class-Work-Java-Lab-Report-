package basicprograms;
//Write a program to calculate the fuel consumption of your truck.The program should ask the user to enter the quantity of diesel to fill up the tank and the distance covered till the tank goes dry.Calculate the fuel consumption and display it in the format (liters per 100 kilometers).
import java.text.DecimalFormat;
import java.util.Scanner;

public class FuelConsumption {

	 public static void main (String[] args) {
		 while(true) {
	      DecimalFormat df2 =new DecimalFormat("0.00"); //create a instance in decimal format
	      Scanner sc= new Scanner (System.in);

	      System.out.println("Enter the no of liters to fill the tank"); //take input from user for no. of liters
	      int ltt =sc.nextInt(); //take user input
	      double lt= (ltt*1.00); //count in litres

	      if(ltt<1){
	          System.out.println(ltt+" is an Invalid Input"); //if input is 0 or negative
	          System.exit(0);
	      }
	      System.out.println("Enter the distance covered"); //user input for distance
	      int diss =sc.nextInt();
	      double dis= (diss*1.00);

	      if(diss<1){
	          System.out.println(diss+" is an Invalid Input"); //if input is 0 or negative
	          System.exit(0);
	      }
	      
	      double hundered = ((lt/dis)*100); //calculate distance
	      System.out.println("Liters/100KM");
	      System.out.println(df2.format(hundered)); //rounding up

	      double miles = (dis*0.6214); //calculate in miles
	      double gallons =(lt*0.2642); //calculate in gallons
	      double mg = miles/gallons;
	      System.out.println("Miles/gallons"); //display in the format
	      System.out.println(df2.format(mg)); //rounding up
		 }
	  }  

}
