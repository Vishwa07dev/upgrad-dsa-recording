package codes;

public class Fibonacci {

    public static int fibRec(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fibRec(n - 1) + fibRec(n - 2);
    }

    public static int fib(int n) {

        if (n <= 1) {
            return n;
        }
        int[] m = new int[n + 1];

        m[0] = 0;
        m[1] = 1;

        for (int i = 2; i <= n; i++) {
            m[i] = m[i - 1] + m[i - 2];
        }
        return m[n];

    }

    public static int fibOpt(int n) {

        if (n <= 1) {
            return n;
        }
        int a=0, b=1,c;

        for (int i = 2; i <= n; i++) {
            c= a+b;
            a=b;
            b=c;
        }
        return b;

    }

    public static void main(String[] args) {
        System.out.println(fibRec(9));
        System.out.println(fib(9));
        System.out.println(fibOpt(9));
    }


}
