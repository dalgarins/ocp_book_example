package chapter7.example1.assertion;

public class AssertionExample1 {

    public static void main(String[] args) {

        int i = Integer.MIN_VALUE;
        if (i < 0) {
            i = -i;
        }
        System.out.println("the value of i is: " + i);
        assert (i >= 0) : "imposible: i is negative";
    }
    
}
