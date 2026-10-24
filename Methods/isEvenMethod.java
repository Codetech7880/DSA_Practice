package Methods;

public class isEvenMethod {

    // Pass parameter in isEven method 
    static String isEven(int number){

        // Checking the gievn number is even or not.
        if(number % 2 == 0){
            // If our case is true.
            return "Number is even";
        }else{
            // If our case is false.
            return "Number is odd";
        }

    }
    public static void main(String[] args) {
        
        System.out.println("Check the given number is even or odd");
        
        // Passing argument in method call. 
        System.out.println(isEven(67));

    }
}
