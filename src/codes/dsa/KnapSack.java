package codes.dsa;

public class KnapSack {

    /**
     *  0/1 knapsack problem
     */
    public static void main(String[] args) {
        int[] w = {10,20,30};
        int[] v = {60,100,120};
        int maxWeight = 50;
        System.out.println(maxValueKnapsack(w,v,maxWeight));
    }

    private static int maxValueKnapsack(int[] w, int[] v, int maxWeight) {

        /**
         * Weights
         * Values
         * m[i][j] maximum value that I can get with i weights and j max allowed
         * weight
         * no of weights =0 || maxWeight = 0 , max Value =0;
         *
         * m[0][j] and m[i][0] = 0
         */
        int[][] m = new int[w.length+1][maxWeight+1];
        for(int items =0;items<=w.length;items++){
            for(int weight=0;weight<=maxWeight;weight++){
                if(items==0 || weight==0){
                   m[items][weight]=0;
                }else if(w[items-1]<=weight){
                    m[items][weight]= Math.max(m[items-1][weight],
                            v[items-1]+m[items-1][weight-w[items-1]]);
                }else{
                    m[items][weight] = m[items-1][weight];
                }

            }
        }
        return m[w.length][maxWeight];

    }
}
