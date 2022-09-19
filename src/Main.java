import java.util.Scanner;

public class Main {

   public static void reverseString(final char[]s) {
       int i = 0;
       int j = s.length - 1;
       while (i < j) {
           char temp = s[i];
           s[i] = s[j];
           s[j] = temp;
           i++;
           j--;
       }
   }
   // DO NOT CHANGE CODE BELOW THIS LINE

   public static void main(String[] args)
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Enter a word to reverse: ");
            char[] word = keyboard.nextLine().toCharArray();
            System.out.println();
            printCharArray(word);
            reverseString(word);
            System.out.print(" reversed is ");
            printCharArray(word);
            System.out.println();
        }
        /**
         * @param s - the char[] to print.
         */
        public static void printCharArray(final char[] s){
            //print out all of the elements
            for(int i = 0; i<s.length;i++) {
                System.out.print(s[i]);
            }
        }
}

