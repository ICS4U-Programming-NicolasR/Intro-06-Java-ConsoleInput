import java.util.Scanner;
/**
* Print statements with proper style check.
*
* @author  Mr. Riscalas
* @version 1.0
* @since   2023-02-08
*/

public final class ConsoleInput {
    /**
     * This is a private constructor used to satisfy the
     * style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private ConsoleInput() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     *
     */
    public static void main(final String[] args) {
        // Created a scanner object
        final Scanner inputScan = new Scanner(System.in);
        // Ask the user what they want to calculate.
        System.out.println("What is the radius of your sphere?");
        final double radius = inputScan.nextDouble();
        if (radius >= 0) {
            final double sphereConstant = 4 * Math.PI / 3;
            final double ans = sphereConstant * (Math.pow(radius, 3));
            System.out.format("The volume of your sphere is %.2f \n", ans);
        } else {
            System.out.println("Please enter a positive number");
        }
        // If statement to organize what operation.
    }
}
