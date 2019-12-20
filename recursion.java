

public class Main {

    public static void main(String[] args) {

        System.out.println(iterativeFactorial(3));
        System.out.println(recursiveFactorial(3));
    }

    // 1 factorial = 1  * 0 factorial = 1
    // 2 factorial = 2 * 1 = 2 * 1 factorial
    // 3 factorial = 3 * 2 * 1 = 3 * 2 factorial
    // 4 factorial = 4 * 3 * 2 * 1 = 4 * 3 factorial
    // n factorial = n * (n - 1) factorial


    // recursive factorial

    public static int recursiveFactorial(int num){
        //breaking point
        if (num == 0){
            return 1;
        }
        return num * recursiveFactorial(num - 1);
    }
    // iterative implementation
    public static int iterativeFactorial(int num){
        if (num == 0){
            return 1;
        }
        int factorial = 1;
        for (int i = 1; i <= num; i++){
            factorial *= i;
        }
        return factorial;
    }    
}
