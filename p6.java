
import java.util.*;
class Demo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size : ");
        int n = sc.nextInt();

        

        int arr[]= new int [n];
        
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter the target element : ");
        int target = sc.nextInt();

        System.out.print(isElementContain(arr,target));


    }

    static boolean isElementContain(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target);
                return true;
        }
        return false;
    }
}
