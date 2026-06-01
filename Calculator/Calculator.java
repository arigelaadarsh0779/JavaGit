import java.util.Scanner;

class Calc {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a / b;
    }

}

class AdvCalc extends Calc {

    public double mod(double a, double b) {
        return a % b;
    }

    public double power(double a, double b) {
        return Math.pow(a, b);

    }

    double sqrt(double a) {
        return Math.sqrt(a);
    }

}

class Triganometri extends AdvCalc {
    public double sin(double a) {
        return Math.sin(a);
    }

    public double cos(double a) {
        return Math.cos(a);

    }

    public double tan(double a) {
        return Math.tan(a);

    }

    public double log(double a) {
        return Math.log(a);
    }

}

public class Calculator {
    public static void main(String[] args) {
        Triganometri Calcii = new Triganometri();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            double a, b;
            System.out.println("-------CalcULATOR-------");

            System.out.println(
                    "Which calulations you want to do  \n1.Basic Calculations \n2.Advanced Calculations \n3.Triganometric Calculations\n4.Exit");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Operations are :");
                System.out.println("1.Addition \n2.Subtraction \n3.Multiplication \n4.Division");
                System.out.println("Enter your choice ");
                int choice2 = sc.nextInt();

                System.out.println("Enter 2 Numbers ");
                a = sc.nextDouble();
                b = sc.nextDouble();

                switch (choice2) {
                    case 1:
                        System.out.println(Calcii.add(a, b));
                        break;
                    case 2:
                        System.out.println(Calcii.subtract(a, b));
                        break;
                    case 3:
                        System.out.println(Calcii.multiplication(a, b));
                        break;
                    case 4:
                        System.out.println(Calcii.division(a, b));
                        break;

                    default:
                        System.out.println("You Entered wrong number ");
                        break;
                }

            } else if (choice == 2) {
                System.out.println("Operations are : ");
                System.out.println(
                        "1.Modulo Division \n2.Finding a power of number \n3.Finding square root of a number  ");
                System.out.println("Enter your CHoice ");
                int choice2 = sc.nextInt();
                switch (choice2) {
                    case 1:
                        System.out.println("Enter 2 Numbers ");
                        a = sc.nextDouble();
                        b = sc.nextDouble();
                        System.out.println(Calcii.mod(a, b));
                        break;

                    case 2:
                        System.out.println("Enter the Base number ");
                        a = sc.nextDouble();
                        System.out.println("Enter the power number ");
                        b = sc.nextDouble();
                        System.out.println(Calcii.power(a, b));
                        break;

                    case 3:
                        System.out.println(" Enter the Number to find sqrt");
                        a = sc.nextDouble();
                        System.out.println(Calcii.sqrt(a));
                        break;

                    default:
                        System.out.println("You Entered wrong number ");
                        break;
                }

            } else if (choice == 3) {
                System.out.println("The operations are ");
                System.out.println("1.Finding sine value \n2.Finding CoSine value \n3.Finding Tan value \n4.Finding Log value");
                System.out.println("Enter your choice ");
                int choice3 = sc.nextInt();
                switch (choice3) {
                    case 1:
                        System.out.println("Enter the degree of sine");
                        a = sc.nextDouble();
                        System.out.println(Calcii.sin(a));
                        break;

                    case 2:
                        System.out.println("Enter the degree of CoSine");
                        a = sc.nextDouble();
                        System.out.println(Calcii.cos(a));
                        break;

                    case 3:
                        System.out.println("Enter the degree of Tan");
                        a = sc.nextDouble();
                        System.out.println(Calcii.tan(a));
                        break;

                    case 4:
                        System.out.println("Enter the log value ");
                        a = sc.nextDouble();
                        System.out.println(Calcii.log(a));
                        break;

                    default:
                        System.out.println(" You Entered Wrong value  ");
                        break;
                }

            } else {

                System.out.println("logging out.....");
            }

        } while (choice != 4);

        sc.close();
    }

}
