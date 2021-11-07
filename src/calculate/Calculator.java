package calculate;

public class Calculator {
    int a;
    int b;
    char symbol;


    public void addition(int a, int b) {
        System.out.println( a + b);
    }
    public void subtraction(int a, int b) {
        System.out.println(a - b);
    }
    public void division(int a, int b) {
        System.out.println(a / b);
    }
    public void multiplication(int a, int b) {
        System.out.println( a * b);
    }
    public void calculateResult(int a, int b, char symbol) {
        switch (symbol) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println("The answer is " + (a - b));
                break;
            case '*':
                System.out.println("The answer is " + a * b);
                break;
            case '/':
                System.out.println("The answer is " + a / b);
                break;
            default:
                System.out.println("Invalid input operator");

        }
    }
}