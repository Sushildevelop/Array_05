package Practice.Array.Array_05;

import java.util.Scanner;

public class Sort_Array_two_pointer_approach {

    public static void sortZerANdOne(int []a){
        int n=a.length;
        int i=0;
        int j=n-1;
        while(i<j){
            if(a[i]==1 && a[j]==0){
                a[i]=0;
                a[j]=1;
                i++;
                j--;
            }
            if (a[i]==0) i++;
            if (a[j]==1) j--;
        }
    }
    public static void main(String[] args) {

//        [0,1,1,0,1,1,0]
      //  [0,0,0,1,1,1,1]

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of array");
       int []a={0,1,1,0,1,1,0};
       sortZerANdOne(a);
        for (int element :a
             ) {
            System.out.print(element+" ");
            
        }
        


    }
}
