package codes;

public class Knapsack {

    public static int knapsackRec(int maxWeight , int[] w, int[] val, int n){
        if(n==0 || maxWeight==0){
            return 0;
        }

        if(w[n-1]>maxWeight){
            return knapsackRec(maxWeight,w,val,n-1);
        }else{
            return Math.max(knapsackRec(maxWeight,w,val,n-1),
                    val[n-1]+ knapsackRec(maxWeight-w[n-1],w,val,n-1));
        }
    }

    public static int knapsack(int maxWeight , int[] w, int[] val){

        int[][] m = new int[w.length+1][maxWeight+1];

        /**
         * m[i][j] -> max value that can be obtained for
         */

        for(int items=0;items<=w.length;items++){
            for(int weight = 0;weight<=maxWeight;weight++){
                if(items==0 || weight==0){
                    m[items][weight]=0;
                }else if(w[items-1] <= weight){
                    m[items][weight] = Math.max(m[items-1][weight] , val[items-1]+ m[items-1][weight-w[items-1]]);
                }else{
                    m[items][weight] = m[items-1][weight] ;
                }
            }
        }

        return m[w.length][maxWeight];
    }

    public static void main(String[] args) {

        int[] val = { 60, 100, 120 };
        int[] w = { 10, 20, 30 };
        int maxWeight = 50;
        System.out.println(knapsackRec(maxWeight,w,val,val.length));

        System.out.println(knapsack(maxWeight,w,val));
    }
}
