/**
 * 
 */
import java.util.Scanner;
/**
 * @author Student
 *
 */
public class BinarySearch {
   public static int binarySearch(int numbers [], int numbersSize, int key) {
      int mid = 0;
      int low = 0;
      int high = 0;
      
      high = numbersSize - 1;

      while (high >= low) {
         mid = (high + low) / 2;
         if (numbers[mid] < key) {
            low = mid + 1;
         } 
         else if (numbers[mid] > key) {
            high = mid - 1;
         } 
         else {
            return mid;
         }
      }

      return -1; // not found
   }

   public static void main(String [] args) {
      Scanner keyboard = new Scanner(System.in);

      int numbers [] = {5, 13, 21, 38, 46, 77, 96, 105};
      final int NUMBERS_SIZE = 8;
      int i = 0;
      int key = 0;
      int keyIndex = 0;

      System.out.print("NUMBERS: ");
      for (i = 0; i < NUMBERS_SIZE; ++i) {
         System.out.print(numbers[i] + " ");
      }
      System.out.println();

      System.out.print("Enter a value: ");
      key = keyboard.nextInt();

      keyIndex = binarySearch(numbers, NUMBERS_SIZE, key);

      if (keyIndex == -1) {
         System.out.println(key + " was not found.");
      } 
      else {
         System.out.println("Found " + key + " at index " + keyIndex + ".");
      }

      return;
   }
}