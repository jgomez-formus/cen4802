
package finonacci;

public class Main {

    public static void main(String[] args) {
        int recursiveValue;
        int nth = 10;
        int nthPosition = nth - 1;

        recursiveValue = Fibonacci.fibonacciRecursion(nthPosition);

        System.out.print("Recursive method - Fibonacci Sequence\n");
        System.out.print("The nth term: " + nth + " of the Fibonacci sequence is " + recursiveValue);
    }

}
