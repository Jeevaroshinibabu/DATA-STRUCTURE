import java.util.*;
public class Anagram {
    public static boolean areAnagrams(String str1, String str2) {
        
        String s1 = str1.replaceAll("\\s", "").toLowerCase();
        String s2 = str2.replaceAll("\\s", "").toLowerCase();

        if (s1.length() != s2.length()) {
            return false;
        }

    
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        
        return Arrays.equals(arr1, arr2);
    }
 public static void main(String[] args) {
     String str1 = "listen";
     String str2 = "silent";

     if (areAnagrams(str1, str2)) {
         System.out.println(str1 + " and " + str2 + " are anagrams.");
     } else {
         System.out.println(str1 + " and " + str2 + " are not anagrams.");
     }
 }   
}
