import java.util.Scanner;

public class Scan {
    // Charlie - create the below in a method rather than variables (use the curly brace syntax)
    // This could be reusable by having one method for integers and one for the operator, which another class
    // can then call each time they need it

    static Scanner scan = new Scanner(System.in);
        public static String inputString() {
            System.out.println("Please enter an operator, +,*,/ or -");
            return scan.nextLine();
        }

        public static int inputNumber1() {
            System.out.println("Please enter your first number");
            return
            scan.nextInt();
            scan.nextLine();
            }

        public static int inputNumber2() {
            System.out.println("Please enter your second number");
            return scan.nextInt();
    }

        }



