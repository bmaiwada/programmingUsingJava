package controlStructure;

public class IfElseStatement {
    public static void main(String[] args) {
        //check if a number is even or odd
        int num = 101;
        if(num % 2 == 0){
            System.out.println(num +" Is an even number.");
        } else {
            System.out.println(num+" Is an odd number");
        }
    }
}
