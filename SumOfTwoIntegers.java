// Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
//
// Example:
// Given a = 1 and b = 2, return 3.

public class SumOfTwoIntegers {
  public int getSum(int a, int b) {
    while (b!=0) {
      int c = a&b;
      a = a^b;
      // shift left for the carry
      b = c<<1;
    }
    return a;
  }
}
