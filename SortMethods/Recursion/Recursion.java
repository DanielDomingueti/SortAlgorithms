package Recursion;

public class Recursion {
    public static void main(String[] args) {
        System.out.println("Type a value to see factorial pattern. ");
        System.out.println("Recursive function: " + recFactorial(4));
        System.out.println("Not recursive function: " + iterativeFactorial(4));

    }

    public static int recFactorial(int n) {
        if (n!=0) {
            return n * (recFactorial(n - 1));
        } else {
            return 1;
        }
    }

    public static int iterativeFactorial(int n) {
        int factorial = 1;

        if (n!=0) {
            for (int i = 1 ; i<=n ; i++) {
                factorial *= i;
            }
            return factorial;
        } else {
            return 1;
        }
    }
}
