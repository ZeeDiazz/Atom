import java.util.Arrays;
import java.lang.Integer;

public class Linaer {
  // A array which goes from 1 to 10
  static int[] array = {1,2,3,4,5,6,7,8,9,10};

  public static void main(String[] args) {
    // a for loop where we use array's length
     for(int i = 0; i < array.length;i++)
     // Choose the number you want in this if statement
     if(array[i] == 7){
       System.out.println("Number:" + array[i] + " at index " + i + " is true");
       return;
     }
     else System.out.println("Number:" + array[i] + " at index " + i + " is false");
  }
}
