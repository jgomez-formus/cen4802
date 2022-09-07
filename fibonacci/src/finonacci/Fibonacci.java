/**
 * Fibonacci Sequence Analysis
 * Fibonacci sequence - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 *
 */


package finonacci;

public class Fibonacci {

    /**
     * Recursive method that return a fibonacci number based on sequence inputNumber
     *
     * @author Juan Gomez Blandon
     * @param inputNumber integer giving the position of the fibonacci number
     * @return
     */
    public static int fibonacciRecursion(int inputNumber) {
        // return specific fibonacci number for input numbers 0 and 1
        if (inputNumber == 0) {
            return 0;
        } else if (inputNumber == 1) {
            return 1;
        }
        // makes 2 recursive calls for every input number
        return fibonacciRecursion(inputNumber - 1) + fibonacciRecursion(inputNumber - 2);
    }

}
