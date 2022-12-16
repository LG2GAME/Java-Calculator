import java.util.Scanner;

public class Main {

    public static void menu(String program) {
        System.out.println("====================");
        System.out.println(program + "Welcome in calculator");
        System.out.println("1 - START");
        System.out.println("2 - EXIT");
        System.out.println("====================");
    }

    public static void calc() {
        System.out.println("====================");
        System.out.println("1 - ADDITION");
        System.out.println("2 - SUBTRACTION");
        System.out.println("3 - MULTIPLICATION");
        System.out.println("4 - DIVISION");
        System.out.println("====================");
    }

    public static void add(int a, int b, String d) {
        int c;
        c = a + b;
        System.out.println(d + "Addition result " + a + " and " + b + " is: " + c);
    }
    public static void sub(int a, int b, String d) {
        int c;
        c = a - b;
        System.out.println(d + "Subtraction result " + a + " and " + b + " is: " + c);
    }
    public static void multi(int a, int b, String d) {
        int c;
        c = a * b;
        System.out.println(d + "Multiplication result " + a + " and " + b + " is: " + c);
    }
    public static void div(int a, int b, String d) {
        int c;
        c = a + b;
        System.out.println(d + "Division result " + a + " and " + b + " is: " + c);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String program = "Calc: ";

        menu(program);
        int start = scan.nextInt();

        if (start == 1) {
            calc();
            int option = scan.nextInt();

            System.out.println(program + "Give me first number: ");
            int a = scan.nextInt();
            System.out.println(program + "Give me second number: ");
            int b = scan.nextInt();

            switch (option) {
                case 1 -> {
                    add(a, b, program);
                } case 2 -> {
                    sub(a, b, program);
                } case 3 -> {
                    multi(a, b, program);
                } case 4 -> {
                    div(a, b, program);
                }
            }
        } else if (start == 2) {
            System.exit(0);
        }
    }
}