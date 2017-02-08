// Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
//
// For example,
// "A man, a plan, a canal: Panama" is a palindrome.
// "race a car" is not a palindrome.
public class IsPallindrome {
  public static void main(String[] args) {

  }
  // My own recursive method past 475/476 test cases, did not pass last one due to runtime being too slow
  public boolean isPalindrome(String s) {

      if(s.length() == 0 || s.length() == 1)
          // if length =0 OR 1 then it is
          return true;
      if (Character.isLetterOrDigit(s.charAt(0)) && Character.isLetterOrDigit(s.charAt(s.length()-1))) {
           if(Character.toLowerCase(s.charAt(0)) == Character.toLowerCase(s.charAt(s.length()-1))) {
              return isPalindrome(s.substring(1, s.length()-1));
           }
      } else if (Character.isLetterOrDigit(s.charAt(0)) || Character.isLetterOrDigit(s.charAt(s.length()-1))) {
          if (Character.isLetterOrDigit(s.charAt(0))) {
              return isPalindrome(s.substring(0, s.length()-1));
          } else {
              return isPalindrome(s.substring(1,s.length()));
          }
      }
      else {
          return isPalindrome(s.substring(1, s.length()-1));
      }
      // if its not the case than string is not.
      return false;
  }
}

//Below is non-recursive method that passes even run-time test case

//
// public boolean isPalindrome(String s) {
//       if (s == null || s.length() == 0) {
//           return true;
//       }
//       int front = 0;
//       int end = s.length() - 1;
//       while (front < end) {
//           while (front < s.length() && !isvalid(s.charAt(front))){ // nead to check range of a/b
//               front++;
//           }
//
//           if (front == s.length()) { // for emtpy string “.,,,”
//               return true;
//           }
//
//           while (end >= 0 && ! isvalid(s.charAt(end))) { // same here, need to check border of a,b
//               end--;
//           }
//
//           if (Character.toLowerCase(s.charAt(front)) != Character.toLowerCase(s.charAt(end))) {
//               break;
//           } else {
//               front++;
//               end--;
//           }
//       }
//
//       return end <= front;
//   }
//   private boolean isvalid (char c) {
//       return Character.isLetter(c) || Character.isDigit(c);
//   }
