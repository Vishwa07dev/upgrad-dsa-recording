package codes;

public class MinimumCoin {

    /**
     * Recursive solution
     */
    public static int minCoinsRec(int[] coins, int v) {
        if (v == 0) {
            return 0;

        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= v) {
                int subResult = minCoinsRec(coins, v - coins[i]);

                if (subResult != Integer.MAX_VALUE && subResult + 1 < res) {
                    res = subResult + 1;
                }
            }
        }
        return res;
    }

    /**
     * Dynamic programming solution
     *
     */
    public static int minCoins(int[] coins,int v){

        /**
         * m[i] -> minimum coins required for making a value of i
         */
        int[] m = new int[v+1];

        /**
         * Initialize with a maximum value
         */
        for(int i=1;i<=v;i++){
            m[i]= Integer.MAX_VALUE;
        }

        /**
         * Calculating the minimum coins for each value, using previous calculations
         */
        for(int i=1;i<=v;i++){
            for(int j=0;j<coins.length;j++){
                if(coins[j]<=i){
                    int minCoins = m[i-coins[j]];
                    if(minCoins != Integer.MAX_VALUE && minCoins+1 < m[i]){
                        m[i]=minCoins+1;
                    }
                }
            }
        }

        if(m[v]==Integer.MAX_VALUE){
            return -1;
        }
        return m[v];

    }




    public static void main(String[] args) {
        int[] arr = {35,20,15};
        System.out.println(minCoinsRec(arr,50));

        System.out.println(minCoins(arr,50));
    }


}
