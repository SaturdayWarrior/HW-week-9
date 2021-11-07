package calculate;

import java.util.Scanner;

public class Main extends Calculator {
    static char ans;

    public static void main(String[] args) {
        Main obj = new Main();
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter First number ");
            obj.a = scanner.nextInt();
            System.out.println("Please Enter The Second Number: ");
            obj.b = scanner.nextInt();
            System.out.println("Please Select Operation to Perform:");
            obj.symbol = scanner.next().charAt(0);
            obj.calculateResult(obj.a, obj.b, obj.symbol);

            System.out.println("Do You Want to continue? Y or N : ");
            ans = scanner.next().toLowerCase().charAt(0);

        } while (ans == 'y');
    }

}

