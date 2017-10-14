package chapter3.example2.lambdas;

interface LambdaFunction {
    void call();
}

public class FirstLambda {

    public static void main(String[] args) {

        LambdaFunction lambdaFunction = () -> System.out.println("Hello");
        lambdaFunction.call();
    }
    
}
