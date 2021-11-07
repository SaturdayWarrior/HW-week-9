import java.util.Scanner;

public class Revers {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number of elements in the array: ");
        int a =obj.nextInt();
        int array[] = new int [a];
        int rev[] = new int [a];
        System.out.println("Enter "+a+" elements");
        for (int i=0; i <a; i++){
            array[i] = obj.nextInt();
        }
        System.out.println("Reverse of array is: ");
        int j = 0;
        for (int i = a; i>0; i--, j ++){
            rev [j] = array[i -1];
            System.out.println(rev[j]);
        }
    }

}
