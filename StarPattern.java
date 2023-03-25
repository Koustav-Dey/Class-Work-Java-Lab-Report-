public class StarPattern {

	public static void main(String[] args) {
		int i,j,k=1;
		for(i=1;i<=5;i++)//outer loop 
		{
			for( j=1;j<=9;j++)//inner loop 
			{
		if(j>=i&&j<=10-i&&k==1)//star printing logic 
		{
			System.out.print("*");
			k=0;
		}
		else {
			System.out.print(" ");
			k=1;
		}
		
		}
			System.out.print("\n");
		}
	}


	}