package controlStructure;

public class sumOfNum {
    public static void main(String[] args) {
        int inputNumber = 7865;
        int sumOfDigits = 0;
        int temp = 0;

        while(inputNumber > 0){
            temp = inputNumber % 10;
            sumOfDigits += temp;
            inputNumber /= 10;
        }
        System.out.println("Sum of the digits are: " +sumOfDigits);
    }

}
