//-----------------Codewars Sum of odd numbers----------------------------------------

// Given the triangle of consecutive odd numbers:

//              1
//           3     5
//        7     9    11
//    13    15    17    19
// 21    23    25    27    29
// ...
// Calculate the row sums of this triangle from the row index (starting at index 1) e.g.:

// rowSumOddNumbers(1); // 1
// rowSumOddNumbers(2); // 3 + 5 = 8

// public static int rowSumOddNumbers(int n) {
    
//     return n * n * n;  
// }

//-----------------Codewars Find the odd int------------------------------------------
// first time using XOR operator

// public class FindOdd {
//   public static int findIt(int[] arr) {
//      int x=0;
//      for(int i=0;i<arr.length;i++)
//        x=x^arr[i];
//      return x;
//   }
// }


//------------------Codewars 'Find the stray number'-----------------------------------

// import java.util.Arrays;

// class Solution {
//   static int stray(int[] numbers) {
//     Arrays.sort(numbers);
//     if (numbers[0] != numbers[1]) {
//       return numbers[0];
//     } else {
//       return numbers[numbers.length -1];
//     }
//   }
// }
