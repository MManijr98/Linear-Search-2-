import java.util.Scanner;

/**
 * @author Student
 *
 */
public class LinearSearch {
	 public static int linearSearch(int numbers[], int numbersSize, int key) {
	      int i = 0;
	      
	      for (i = 0; i < numbersSize; ++i) {
	         if (numbers[i] == key) {
	            return i;
	         }
	      }
	      
	      return -1; /* not found */ }
	      public static void main(String [] args) {
	          Scanner keyboard = new Scanner(System.in);
	          int numbers [] = {1, 3, 8, 19, 22, 34, 49, 100, 112, 198};
	          final int NUMBERS_SIZE = 10;
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
	          
	          keyIndex = linearSearch(numbers, NUMBERS_SIZE, key);
	          
	          if (keyIndex == -1) {
	             System.out.println(key + " was not found.");
	          } 
	          else {
	             System.out.println("Found " + key + " at index " + keyIndex + ".");
	          }
	          
	          return;
	       }
	    }