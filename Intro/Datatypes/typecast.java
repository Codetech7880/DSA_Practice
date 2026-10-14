public class typecast {
    public static void main(String[] args) {
        
        // Convert an int value into a double and print both values.
        int num = 10;
        double typeoNum = num;
        System.out.println(typeoNum);

        // Convert a double value into an int and observe the output.
        double a = 20.0;
        int b = (int)a;
        System.out.println(b);

        // Convert a char into an int and print its numeric value.
        char alphaNum = 'A';
        int printNum = (int)alphaNum;
        System.out.println(printNum);

        // Store 25.75 in a double variable and convert it into an int.
        double var = 25.75;
        int resultVar = (int)var;
        System.out.println(resultVar);

        // Try assigning a double value directly to an int variable. Identify the error and fix it.
        int num1 = (int)34.87;
        System.out.println(num1);

    }
}
