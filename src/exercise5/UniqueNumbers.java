package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        int[] uniqueNumbers = new int[numbers.length];

        int nextUniqueIndex = 0;

        for (int index = 0; index < numbers.length; index++) {
          boolean numberFound = false;
            for (int i = 0; index < uniqueNumbers.length; i++)
            {
            
            if (numbers[index] == uniqueNumbers[i]) {
              numberFound = true;
              break;

        }

        }
        if (!numberFound){
          uniqueNumbers[nextUniqueIndex] = numbers[index];
          nextUniqueIndex++;
           }
}

        String uniqueNumbersAsString = Arrays.toString(uniqueNumbers);
        System.out.println("Unique numbers: " + uniqueNumbersAsString);
    }
}