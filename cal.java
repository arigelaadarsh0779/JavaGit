import java.util.Scanner;
class calc{
    public double add(double a, double b){
        return a+b;
    }
    public double subtract (double a, double b){
        return a-b;
    }
    public double multiplication (double a, double b){
        return a*b;
    }
    public double division (double a, double b){
        if (b==0){
            System.out.println("Cannot divide by zero");
        }
        return a/b;
    }
    
    


}
class advCal extends calc{

    public double mod(double a , double b){
        return a%b;
    }
    public double power(double a ,double b ){
        return Math.pow(a,b);

    }
    double sqrt(double a){
        return Math.sqrt(a);
    }
    public double sin(double a){
        return Math.sin(a);
    }
    public double cos(double a ){
        return Math.cos(a);

    }
    public double tan(double a){
        return Math.tan(a);

    }
    public double log(double a ){
        return Math.log(a);
    } 
}

public class cal {
 public static void main (String[]args ){
    Scanner sc =new Scanner(System.in);

    System.out.println("--------------CALCULATOR------------");
    double a,b;
    System.out.println("Enter your choice \n 1.Basic calculations \n 2. Advanced calculations");
    int choice = sc.nextInt();
    if (choice==1) {
        System.out.println("Operations are :");
        System.out.println("1.Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division");
        System.out.println(" Enter your choice ");
        int choice2 =sc.nextInt();

        
    } 
    else if(choice==2){

    }
    else {
        System.out.println(" Enter correct value");
    }

    


    sc.close();
 }
    
}
