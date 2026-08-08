
import java.util.*;

class Demo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter array length : ");

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        System.out.print(allEqual(arr));
    }

    static boolean allEqual(int arr[]){
        for(int i =0; i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                return false;
            }
        }
        return true;
    }
}