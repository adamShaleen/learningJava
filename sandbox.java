import java.util.Arrays;

class Solution {
  static int stray(int[] numbers) {
    Arrays.sort(numbers);
    if (numbers[0] != numbers[1]) {
      return numbers[0];
    } else {
      return numbers[numbers.length -1];
    }
  }
}
