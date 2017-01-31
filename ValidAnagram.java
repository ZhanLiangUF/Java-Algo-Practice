// Given two strings s and t, write a function to determine if t is an anagram of s.
//
// For example,
// s = "anagram", t = "nagaram", return true.
// s = "rat", t = "car", return false.
import java.util.*;
public class ValidAnagram {
  public boolean isAnagram(String s, String t) {
   int lengthOfS = s.length();
   int lengthOfT = t.length();
       if (lengthOfS == lengthOfT) {
           char[] charsOfS = s.toCharArray();
           Arrays.sort(charsOfS);
           char[] charsOfT = t.toCharArray();
           Arrays.sort(charsOfT);
           for (int i = 0;i<lengthOfS;i++) {
               if (charsOfS[i] != charsOfT[i]) {
                   return false;
               }
           }
           return true;
       } else {
           return false;
       }
   }
}
