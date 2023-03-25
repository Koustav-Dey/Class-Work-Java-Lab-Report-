public class AsciiValue {

    public static void main(String[] args) {

        char ch = 'd'+3;
        int ascii = ch;
        // we can also cast char to int
        int castAscii = ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
    }
}