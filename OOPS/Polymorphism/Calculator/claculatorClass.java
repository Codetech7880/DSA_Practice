package OOPS.Polymorphism.Calculator;

public class claculatorClass {

    // Calculating the sum with the help of calculate method.
    // performing operations using method overloading.
    public void calculate(int a, int b){
        int sum = a + b;
        System.out.println("Addintion of two numbers is : " + sum);
    }

    public void calculate(int a, int b, int c){
        int sum = a + b + c;
        System.out.println("Addition of three number is : " + sum);
    }

    public void claculate(double a, double b){
        double sum = a + b ;
        System.out.println("The addition of two numbers is : " + sum);
    }

    // Calculating addition, subtraction, multiplication and division on the basis of operator.
    public void calculate(int a, int b, char operator){
        if(operator == '+'){
            int sum = a + b;
            System.out.println("Addition on the basis of operator : " + sum);
        }else if(operator == '-'){
            int sub = a - b;
            System.out.println("Subtraction on the basis of operator : " + sub);
        }else if(operator == '*'){
            int mul = a * b;
            System.out.println("Multiplication on the basis of operator : " + mul);
        }else if(operator == '/'){
            int div = a / b;
            System.out.println("Division on the basis of operator : " + div);
        }else{
            System.out.println("Invalid Cridentials.");
        }
    }

}