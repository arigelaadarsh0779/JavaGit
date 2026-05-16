import java.util.Scanner;

class calc {
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
        }
        return a / b;
    }

}

class advCal extends calc {

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
class triganometri extends advCal{
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

public class cal {
    public static void main(String[] args) {
        triganometri calcii = new triganometri();
        Scanner sc = new Scanner(System.in);
        double a, b;
        System.out.println("--------------CALCULATOR------------");

        System.out.println("Enter your choice \n 1.Basic calculations \n 2.Advanced calculations \n 3.Triganometric calculations");
        int choice = sc.nextInt();


        if (choice == 1) {
            System.out.println("Operations are :");
            System.out.println("1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division");
            System.out.println(" Enter your choice ");
            int choice2 = sc.nextInt();

            System.out.println("Enter 2 Numbers ");
            a = sc.nextDouble();
            b = sc.nextDouble();

            switch (choice2) {
                case 1:
                     calcii.add(a, b);
                    break;
                case 2:
                    calcii.subtract(a, b);
                    break;
                case 3:
                    calcii.multiplication(a, b);
                    break;
                case 4:
                    calcii.division(a, b);
                    break;

                default:
                    System.out.println(" You entereed wrong number ");
                    break;
            }

        } 
        else if (choice == 2) {
            System.out.println(" Operations are : ");
            System.out.println(" 1.MOdulo division \n 2.Finding a power of a number \n 3.Finding square root of a number  ");
            System.out.println("Enter your CHoice ");
            int choice2=sc.nextInt();
            switch (choice2) {
                case 1:
                     System.out.println("Enter 2 Numbers ");
                     a = sc.nextDouble();
                     b = sc.nextDouble();
                     calcii.mod(a, b);
                    break;

                case 2:
                    System.out.println("Enter the Base number ");
                     a = sc.nextDouble();
                     System.out.println("Enter the power number ");
                     b = sc.nextDouble();
                     calcii.power(a, b);
                     break;

                case 3:
                    System.out.println(" Enter the numer to find sqrt");
                     a = sc.nextDouble();
                     calcii.sqrt(a);
                     break;
                
                default:
                    System.out.println(" you enteredd wrong number ");
                    break;
            }

        }
        else if ( choice ==3){
            System.out.println("The operations are ");
            System.out.println("1.Finding sine value \n 2.Finding CoSine value \n 3. Finding Tan value \n 4.Finding Log value");
            System.out.println("Enter your choice ");
            int choice3=sc.nextInt();
            switch (choice3) {
                case 1:
                    System.out.println("Enter the degree of sine");
                     a = sc.nextDouble();
                     calcii.sin(a);
                     break;
                
                case 2:
                    System.out.println("Enter the degree of CoSine");
                     a = sc.nextDouble();
                     calcii.cos(a);
                    break;

                case 3:
                     System.out.println("Enter the degree of Tan");
                     a = sc.nextDouble();
                     calcii.tan(a);
                    break;

                case 4: 
                  System.out.println("Enter the log value ");
                     a = sc.nextDouble();
                     calcii.log(a);
                    break;
            
                default:
                    System.out.println(" You Entered Wrong value  ");
                    break;
            }

        
        }
        else{
            System.out.println("You ENtered wrong value ");
        }

        sc.close();
    }

}
