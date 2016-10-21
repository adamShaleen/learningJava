public class Sum {
     public int GetSum(int a, int b) {
        int output = 0;
        
        if (a == b) {
          return a;  
        }
        
        else if(a < b) {
          for (int x = a; x <= b; x++) {
            output += x;
          }
        }  
        
        else {
          for (int y = b; y <= a; y++) {
            output += y;
          }
        }
        
        return output;
     }
  }
