/**
 * Fibonacci Sequence Analysis
 * Fibonacci sequence - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 *
 */

package finonacci;

public class Main {

    /**
     * Main method that executes the program
     *
     * @author Juan Gomez Blandon
     * @return null
     */
    public static void main(String[] args) {
        int recursiveValue;
        int nth = 10;
        int nthPosition = nth - 1;

        recursiveValue = Fibonacci.fibonacciRecursion(nthPosition);

        System.out.print("Recursive method - Fibonacci Sequence\n");
        System.out.print("The nth term: " + nth + " of the Fibonacci sequence is " + recursiveValue);
    }
}
