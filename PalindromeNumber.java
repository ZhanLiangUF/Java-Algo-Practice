public class PalindromeNumber {
  public boolean isPalindrome(int x) {
    //negative numbers are not palindrome
    if (x < 0)
    return false;

    // initialize how many zeros
    int div = 1;
    while (x / div >= 10) {
      div *= 10;
    }

    while (x != 0) {
      int left = x / div;  //Example 7777/1000 = 7
      int right = x % 10; //Example 7777%10 = 7

      if (left != right)
      return false;

      x = (x % div) / 10; // 7777 % 1000 = 777 / 10 = 77
      div /= 100; // took away two zeros in x so take away two zeros in div
    }

    return true;
  }
}
