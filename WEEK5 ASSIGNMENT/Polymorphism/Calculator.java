public class Calculator {


    public int calculate(int a, int b) {
        return a + b;
    }


    public double calculate(double a, double b) {
        return a + b;
    }


    public int calculate(int a, int b, char operator) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0) {
                    return a / b;
                } else {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }


    public static void main(String[] args) {
        Calculator calc = new Calculator();


        System.out.println("Sum of 10 and 20 (int): " + calc.calculate(10, 20)); 
        System.out.println("Sum of 5.5 and 2.3 (double): " + calc.calculate(5.5, 2.3)); 
        System.out.println("Product of 10 and 20 (int with operator): " + calc.calculate(10, 20, '*')); 
        System.out.println("Division of 10 and 2 (int with operator): " + calc.calculate(10, 2, '/')); 
    }
}
