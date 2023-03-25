package basicprograms;
//A parking lot in a mall has RxC number of parking spaces. Each parking space will either be  empty(0) or full(1). The status (0/1) of a parking space is represented as the element of the matrix. The task is to find index of the prpeinzta row(R) in the parking lot that has the most of the parking spaces full(1).
import java.util.Scanner;

public class CarParking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of row:"); //take no. of rows
        int row=sc.nextInt();
        System.out.println("Enter no. of column:"); //take no. of columns
        int col=sc.nextInt();
        System.out.println("Enter the elements:"); //take all elements
        int arr[][]=new int[row][col]; //create an array instance
        
        for(int i=0;i<row;i++) //loop for the row
              for(int j=0;j<col;j++) //loop for the column
                   arr[i][j]=sc.nextInt(); //put elements to the array
      
         int max=0,count=0,index=0; //initialize all the counts
         for(int i=0;i<row;i++) 
         {       count=0;
                  for(int j=0;j<col;j++)
                  {
                          if(arr[i][j]==1)
                               count++;      
                  }
                   if(count>max)
                   {
                          max=count;
                          index=i+1; //increase index
                   }
         }
         System.out.println(index); //print the index
	}

}
