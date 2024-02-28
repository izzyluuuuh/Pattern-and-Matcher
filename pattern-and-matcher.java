import java.util.*;
import java.util.regex.*;

public class Rhyme {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        String Word1;
        String Word2;
        String substring;
        String sub;
        boolean match;
        
      System.out.println("Enter the first word: ");
      Word1 = sc.nextLine();
      
      System.out.println("Enter the second word: ");
      Word2 = sc.nextLine();
      
      substring = Word1.substring(Math.max(Word1.length() - 2, 0));
      sub = substring;
      
      Pattern p = Pattern.compile("[a-zA-Z]{1,2}" + sub);
      
      Matcher m = p.matcher(Word2);
      
      match = m.matches();
      
      if(match==true) {
          
          System.out.println("\n" + Word1 + " rhymes with " + Word2);
          
      }
      
      else {
          
          System.out.println("\n" + Word1 + " does not rhyme with " + Word2);
          
      }
      
      
    }
}