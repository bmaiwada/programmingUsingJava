package controlStructure;

public class highestNum {
    //find out the highest number
    public static void main(String[] args) {
        int numOne = 4;
        int numTwo = 6;
        int numThree = 1;

        if(numOne > numTwo){
            System.out.println(numOne);
        } else if (numTwo > numThree) {
            System.out.println(numTwo);
        } else {
            System.out.println(numThree);
        }
    }

}
