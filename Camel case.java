import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n = sc.nextLine();
         StringBuilder c = new StringBuilder();
        String[] words = n.split(" ");
        
        for (String word : words) {
            if (!word.isEmpty()) {      
                c.append(Character.toUpperCase(word.charAt(0)));
                c.append(word.substring(1).toLowerCase());
            }
        }
        System.out.println(c.toString());
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
