
package finonacci;

public class Fibonacci {

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
