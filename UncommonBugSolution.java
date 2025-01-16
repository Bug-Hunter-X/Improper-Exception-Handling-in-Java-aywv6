public class UncommonBugSolution {
    public static void main(String[] args) {
        int x = 5;
        try {
            x = x / 0; // This will cause an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: Program terminated");
            System.exit(1); //Properly exits the program
        }
        System.out.println(x); 
    }
}