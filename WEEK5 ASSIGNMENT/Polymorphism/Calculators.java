class Calculator {

   
    public double calculate(double a, double b) {
        return a + b;
    }
}


class SubtractionCalculator extends Calculator {

    
    @Override
    public double calculate(double a, double b) {
        return a - b;
    }
}


class MultiplicationCalculator extends Calculator {

   
    @Override
    public double calculate(double a, double b) {
        return a * b;
    }
}


class DivisionCalculator extends Calculator {


    @Override
    public double calculate(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }
}


public class Calculators {
    public static void main(String[] args) {
        Calculator addCalc = new Calculator();
        Calculator subCalc = new SubtractionCalculator();
        Calculator mulCalc = new MultiplicationCalculator();
        Calculator divCalc = new DivisionCalculator();


        System.out.println("Addition: " + addCalc.calculate(10, 5));          
        System.out.println("Subtraction: " + subCalc.calculate(10, 5));      
        System.out.println("Multiplication: " + mulCalc.calculate(10, 5));    
        System.out.println("Division: " + divCalc.calculate(10, 5));          
    }
}

