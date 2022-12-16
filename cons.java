import java.util.Scanner;

public class cons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch == 'a'||ch == 'i'||ch == 'o'||ch == 'u'||ch == 'e'||ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U'){
            System.out.println("Alphabet is vowel");
        }
        else
        {
            System.out.println("Alphabet is Cons");
        }

    }
        
    }

