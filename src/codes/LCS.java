package codes;

public class LCS {

    /**
     * find the LCS using recursion
     */
    public static int findLcsLengthRec(char[] str1, char[] str2, int m , int n){
        if(m==0|| n==0){
            return 0 ;
        }

        if(str1[m-1]==str2[n-1]){
            return 1 + findLcsLengthRec(str1,str2,m-1,n-1);
        }else{
            return Math.max(findLcsLengthRec(str1,str2, m-1, n), findLcsLengthRec(str1,str2, m, n-1));
        }
    }

    /**
     * Find the LCS using DP
     */
    public static int  findLcsLength(char[] str1, char[] str2){
        int[][] m = new int[str1.length+1][str2.length+1];

        for(int i=0;i<=str1.length;i++){
            for(int j=0;j<=str2.length;j++){
                if(i==0 || j==0){
                    m[i][j]=0;
                }else if( str1[i-1]==str2[j-1]){
                    m[i][j] = m[i-1][j-1]+1;
                }else{
                    m[i][j]= Math.max(m[i-1][j], m[i][j-1]);
                }
            }
        }
        return m[str1.length][str2.length];
    }
    public static void main(String[] args) {
        String str1 = "ABCGHPER";
        String str2 = "MBUHIPCDRA";

        System.out.println(findLcsLengthRec(str1.toCharArray(),
                str2.toCharArray(), str1.length(),str2.length()));

        System.out.println(findLcsLength(str1.toCharArray(),str2.toCharArray()));
    }
}
