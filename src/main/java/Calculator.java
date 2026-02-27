public class Calculator {

    // 1. Square root function - √x
    public double squareRoot(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number.");
        }
        return Math.sqrt(x);
    }

    // 2. Factorial function - x!
    public long factorial(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Factorial of negative numbers is undefined.");
        }
        long fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }

    // 3. Natural logarithm (base e) - ln(x)
    public double naturalLog(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Logarithm is only defined for positive numbers.");
        }
        return Math.log(x);
    }
}