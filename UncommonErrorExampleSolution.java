public class UncommonErrorExampleSolution {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;
        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero occurred.");
            //Handle the exception appropriately, perhaps by using a default value or logging the error.
        }
    }
}