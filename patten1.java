import java.util.Scanner;
public class patten1 {
    public static void main(String[] args){
        int r = 8;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Rows : ");
        // r = sc.nextInt();
        for (int i = 0; i <= r-1; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(" ");
            }
            for (int k=0; k <= r-1-i;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }




    }
}
