import java.util.Scanner;

public class MarkSheet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter RollNumber: ");
        String roll = scanner.nextLine();
        System.out.println("Enter Marks of Subject Maths\t\t");
        int Maths = scanner.nextInt();
        while (!(0 <= Maths && Maths <= 100)) {
            System.out.println("Invalid input, Marks should between 0 to 100");
            System.out.println("Please Enter the correct marks\t\t");
            Maths = scanner.nextInt();
        }
        System.out.println("Enter marks of Subject Science\t\t");
        int Science = scanner.nextInt();
        while (!(0 <= Science && Science <= 100)) {
            System.out.println("Invalid input, Marks should between 0 to 100");
            System.out.println("Please Enter the correct marks\t\t");
            Maths = scanner.nextInt();
        }
        System.out.println("Enter marks of Subject English \t\t");
        int English = scanner.nextInt();
        while (!(0 <= English && English <= 100)) {
            System.out.println("Invalid input, Marks should between 0 to 100");
            System.out.println("Please Enter the correct marks\t\t");
            English = scanner.nextInt();
        }
        int total;
        float p;
        total = Maths+Science+English;
        p = total/3;

        System.out.print("\n|_____________________________________________|");
        System.out.print("\n|                                             |");
        System.out.print("\n|                  MarkSheet                  |");
        System.out.print("\n|                                             |");
        System.out.print("\n|_____________________________________________|");
        System.out.print("\n|\tName \t\t\t:\t" + name +"                  |");
        System.out.print("\n|\tRoll NO \t\t:\t" + roll +"                    |");
        System.out.print("\n|_____________________________________________|");
        System.out.print("\n|\t Maths\t\t\t:\t"+Maths+"                    |");
        System.out.print("\n|\t Science\t\t:\t"+Science+"                    |");
        System.out.print("\n|\t English\t\t:\t"+English+"                    |");
        System.out.print("\n|_____________________________________________|");
        System.out.print("\n|\tTotal\t\t:\t"+total+"                      |");
        System.out.print("\n|_____________________________________________|");
        System.out.println("\n|\tPercentage\t:\t"+p+"                      |");
        int marks =0;
        if (p>=34 && Maths >=35 && Science>=35 && English>=35) {
            System.out.print("\n|\tResult \t\t:\tPass                     |");
        }else if (Maths <35 || Science < 35 || English <35){
                System.out.println("        Result : Fail                |");
                System.out.println("|       Grad ---                     |");
            } else if (p >= 80) {
                System.out.println("|       Grad A+                       |");
            } else if (p < 80 && p >= 60) {
            System.out.println("|       Result : Pass                 |");
                System.out.println("|       Grad A                        |");
            } else if (p < 60 && p >= 50) {
            System.out.println("|       Result : Pass                 |");
                System.out.println("|       Grad B                        |");
            } else if (marks < 50 && marks >= 35) {
                System.out.println("|       Result : Pass                 |");
                System.out.println("|       Grad C                        |");
            }
            System.out.println("Closing Scanner...");
            scanner.close();
            System.out.println("Scanner closed");
        }

}