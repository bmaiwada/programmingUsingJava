package operators;

public class TernaryOperators {
    public static void main(String[] args) {
        int numOne = 10;
        int numTwo = 5;

        int min = (numOne < numTwo) ? numOne : numTwo;
        System.out.println(min);
    }
}
