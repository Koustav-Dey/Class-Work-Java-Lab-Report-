package basicprograms;

import java.util.ArrayList;
import java.util.Arrays;
 
// Main class
class ArrayToString {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating an empty ArrayList of string type
        ArrayList<String> al = new ArrayList<String>();
 
        // Populating the ArrayList by custom elements
        al.add("abdul");
        al.add("sourav");
        al.add("dipak");
        al.add("rohit");
 
        String[] str = new String[al.size()];
 
        for (int i = 0; i < al.size(); i++) {
            str[i] = al.get(i);
        }
 
        // Printing using for each loop
        for (String k : str) {
            System.out.println(k);
        }
    }
}
