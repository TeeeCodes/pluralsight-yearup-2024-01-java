import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Scanner Function
        Scanner calcNum1 = new Scanner(System.in);

        // User Inputs
        System.out.printIn("Enter First Number: ");
        int num1 = calcNum1.nextInt();
        System.out.printIn("Enter Second Number: ");
        int num2 = calcNum1.nextInt();

        calcNum1.nextLine();

        // Prompt Questions
        System.out.println("What would you like to do?");
        System.out.print("Enter '(a)dd', '(s)ubtract', '(d)ivide', '(m)ultiply': ");

        String logicScanner = scanner.nextLine();
        System.out.println("One Moment");

        // Logic
        if (logicScanner.equals("a")) {
            System.out.println(num1 + num2);
        } else if (logicScanner.equals("s")) {
            System.out.println(num1 - num2);
        } else if (logicScanner.equals("d")) {
            System.out.println(num1 / num2);
        } else if (logicScanner.equals("m")) {
            System.out.println(num1 * num2);
        } else {
            System.out.println("Unable to Process..");
        }

        }

}