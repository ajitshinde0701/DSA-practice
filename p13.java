

import java.util.*;

class Demo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        int freq =0;
        for(int i =0;i<n ;i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter the target element to find its frequency : ");
        int target = sc.nextInt();

        for(int i =0; i<n ; i++){
            if(arr[i]==target){
                freq++;
            }
        }

        System.out.println(" frequency of the  "+ target +" is "+ freq);



    }
}
