public class UncommonBug {
    public static void main(String[] args) {
        int x = 5;
        try {
            x = x / 0; // This will cause an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught");
            //The bug is that we don't handle the exception properly
            //and the program continues to run, potentially leading to unexpected results.
        }
        System.out.println(x); // This line will still execute after the exception
    }
}