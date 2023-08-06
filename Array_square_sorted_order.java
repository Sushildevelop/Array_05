package Practice.Array.Array_05;

import java.lang.annotation.Target;

public class Array_square_sorted_order {
    static int[] sortedSquares(int[]a){
        int n=a.length, i=0,j=n-1,k=0;
        int ans[]=new int[n];
        while(i<=j){
            if (Math.abs(a[i])<Math.abs(a[j])){
                a[j]*=a[j];
                ans[k++]=(a[j--]);
            }
            else{
                a[i]*=a[i];
                ans[k++]=(a[i++]);
            }
        }
        reverse(ans,0,ans.length-1);
        return ans;

    }
    private static void reverse(int[] a, int i, int j){
        int temp=0;
        while(i<j){
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[]a={-10,-3,2,5,6};
       int []ans=sortedSquares(a);
        for (int element:ans
             ) {
            System.out.print(element+" ");

        }
    }
}
