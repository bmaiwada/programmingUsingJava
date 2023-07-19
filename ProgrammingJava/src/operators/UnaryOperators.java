package operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int numOne = 10;
        int numTwo = 5;
        boolean isTrue = true;

        //post increment
        System.out.println(numOne++);
        //pre increment
        System.out.println(++numOne);
        //post decrement
        System.out.println(numTwo--);
        //pre decrement
        System.out.println(--numTwo);
        System.out.println(!isTrue+" "+ ~numOne);
    }
}
