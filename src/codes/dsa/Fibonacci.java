package codes.dsa;

public class Fibonacci {

    public static int fib(int n){
        if(n<=1){
            return n;
        }
        int[] m = new int[n+1];
        /**
         * m[i] -> value at the ith index in the fibonacci series
         */

        m[0]=0;
        m[1]=1;

        for(int i=2;i<=n;i++){
            m[i]=m[i-1]+m[i-2];
        }
        return m[n];

    }
    /**
     * Find the nth element in the Fibonacci Series
     */

    public static void main(String[] args) {
        System.out.println(fib(9));
    }

}
