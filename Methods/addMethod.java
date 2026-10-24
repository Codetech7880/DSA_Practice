package Methods;

public class addMethod {

    // Passing parameter in the add method.
    static int add(int a, int b){
        return (a + b);
    }
    public static void main(String[] args) {
        
        System.out.println("Using add method without void returnType");
        // Passing argument in the method call
        System.out.println(add(2, 3));

    }
}
