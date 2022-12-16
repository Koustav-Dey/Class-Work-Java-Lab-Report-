import java.util. Scanner;
public class multipication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int mul = sc.nextInt();
        for (int i =1;i<=10; i++){
            System.out.println(mul+"*"+i+"="+mul * i);
        }
        
    }
        
}
