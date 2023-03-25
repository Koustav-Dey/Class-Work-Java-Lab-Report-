class Cube {
 

    static void printCubes(int a, int b)

    {
 

        // Traverse through all numbers in given range

        // and one by one check if number is prime

        for (int i = a; i <= b; i++) {
 

            // Check if current number 'i'

            // is perfect cube

            for (int j = 1; j * j * j <= i; j++) {

                if (j * j * j == i) {

                    System.out.print(j * j * j + "  ");

                    break;

                }

            }

        }

    }

    // Driver method

    public static void main(String[] args)

    {

        int a = 1, b = 100;

        System.out.println("Perfect cubes in given range:");

        printCubes(a, b);

    }
}