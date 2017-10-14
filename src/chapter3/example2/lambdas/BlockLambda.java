package chapter3.example2.lambdas;

interface LambdaFunctionBlock {

    String intKind(int a);
}

public class BlockLambda {

    public static void main(String[] args) {

        LambdaFunctionBlock lf = (int a) -> {
            if (a % 2 == 0) {                
                return "even";
            }
            return "odd";
        };
        System.out.println(lf.intKind(9));
    }

}
