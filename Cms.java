import java.util.Scanner;
public class Cms {

    public static void cse() {
        System.out.println("You will get the following subjects");
        System.out.println("DSA");
        System.out.println("DBMS");
        System.out.println("Computer Networks (CN)");
    }

    public static void it() {
        System.out.println("You will get the following subjects");
        System.out.println("DSA");
        System.out.println("DBMS");
        System.out.println("Computer Networks (CN)");
        System.out.println("MPMC (Multi processor and Multi Controller)");
        System.out.println("Information Security");
    }

    public static void ece() {
        System.out.println("You will get the following subjects");
        System.out.println("Wireless Communication");
        System.out.println("Switching Theory and Logic Design (STLD)");
        System.out.println("Mobile Systems Communication");
    }

    public static void ee() {
        System.out.println("You will get the following subjects");
        System.out.println("Switching Theory and Logic Design (STLD)");
        System.out.println("Control Systems");
        System.out.println("Electrical Circuits and Designs");
    }

    public static void mech() {
        System.out.println("Force and Friction");
        System.out.println("Motors and its Types");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to Swami Vivekananda University Portal!!!");
        System.out.println("Select one of the following streams in which you want to study");
        
        while(true) {
            System.out.println("1. Computer Science");
            System.out.println("2. Information Technology");
            System.out.println("3. Electronics and Communication");
            System.out.println("4. Electrical and Electronics");
            System.out.println("5. Mechanical");
            System.out.println("10. Exit");

            System.out.println("Enter the choice number from above");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("You have chosen Computer Science.");
                    cse();
                    System.out.println("Are you sure you want to lock this stream? Choose either A or B.");
                    System.out.println("1. Yes, I'm sure");
                    System.out.println("2. No, I'm not sure");
                    int ch = sc.nextInt();
                    if(ch == 1) {
                        System.out.println("Congratulations!! You are now a CSE student at SVU");
                        return;
                    }
                    break;
                case 2:
                    System.out.println("You have chosen Information Technology.");
                    it();
                    System.out.println("Are you sure you want to lock this stream? Choose either A or B.");
                    System.out.println("1. Yes, I'm sure");
                    System.out.println("2. No, I'm not sure");
                    int ch2 = sc.nextInt();
                    if(ch2 == 1)  {
                        System.out.println("Congratulations!! You are now an IT student at SVU");
                        return;
                    }
                    break;
                case 3:
                    System.out.println("You have chosen Electronics and Communication.");
                    ece();
                    System.out.println("Are you sure you want to lock this stream? Choose either A or B.");
                    System.out.println("1. Yes, I'm sure");
                    System.out.println("2. No, I'm not sure");
                    int ch3 = sc.nextInt();
                    if(ch3 == 1)  {
                        System.out.println("Congratulations!! You are now an ECE student at SVU");
                        return;
                    }
                    break;
                case 4:
                    System.out.println("You have chosen Electrical and Electronics");
                    ee();
                    System.out.println("Are you sure you want to lock this stream? Choose either A or B.");
                    System.out.println("1. Yes, I'm sure");
                    System.out.println("2. No, I'm not sure");
                    int ch4 = sc.nextInt();
                    if(ch4 == 1) {
                        System.out.println("Congratulations!! You are now an EEE student at SVU");
                        return;
                    }
                    break;
                case 5:
                    System.out.println("You have chosen Mechanical Engineering.");
                    mech();
                    System.out.println("Are you sure you want to lock this stream? Choose either A or B.");
                    System.out.println("1. Yes, I'm sure");
                    System.out.println("2. No, I'm not sure");
                    int ch5 = sc.nextInt();
                    if(ch5 == 1) {
                        System.out.println("Congratulations!! You are now a ME student at SVU");
                        return;
                    }
                    break;
                case 10:
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            
            if(choice == 10) break;
        }
        sc.close();
    }
}

