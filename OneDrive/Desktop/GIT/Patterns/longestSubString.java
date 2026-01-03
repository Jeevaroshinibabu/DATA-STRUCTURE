public class longestSubString {
public static boolean allUnique(String str) {
    int[] charIndex = new int[128];
      for (int i = 0; i < str.length(); i++) {
          char c = str.charAt(i);
           if (charIndex[c] == 1) {
               return false;
           } 
           charIndex[c] = 1;
      }
      return true;
   }

    
    public static void main(String[] args) {
    String str = "abcabcbb";
    int n = str.length();
    int maxLength = 0;
    int start = 0;

    for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {
            String substr = str.substring(i, j + 1);
            if (allUnique(substr)) {
                if (substr.length() > maxLength) {
                    maxLength = substr.length();
                    start = i;
                }
            }
        }
    }

    System.out.println("Longest substring without repeating characters: " + str.substring(start, start + maxLength));
    System.out.println("Length: " + maxLength);    
}
}