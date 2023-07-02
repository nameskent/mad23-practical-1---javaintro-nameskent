import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        /**
         * Prompt the user for number. This input indicates the number of integers the user will be entering next.
         * Print out the mode (highest occurrence) from the set of integers.
         *    e.g.
         *     > 5
         *     > 2
         *     > 4
         *     > 1
         *     > 3
         *     > 4
         *     4
         *
         *    e.g.
         *     > 4
         *     > 2
         *     > 2
         *     > 3
         *     > 3
         *     2
         * Hint: Use a loop to get input. Use another 2 loops to find the mode
         */

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int count = in.nextInt();

        int[] numbers = new int[count];

        System.out.println("Enter the integers:");

        for (int i = 0; i < count; i++) {
            numbers[i] = in.nextInt();
        }

        int mode = findMode(numbers);

        System.out.println("The mode is: " + mode);
    }

    public static int findMode(int[] numbers) {
        int mode = 0;
        int maxCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            int count = 0;

            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == numbers[i]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mode = numbers[i];
            }
        }

        return mode;
    }
}
