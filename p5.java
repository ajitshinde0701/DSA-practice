
import java.util.*;

class Demo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size : ");
        int n = sc.nextInt();

        int []arr= new int[n];
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        boolean isEqual= fun(arr);
        System.out.print(isEqual);
    }

    static boolean fun(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1])
                return false;
            
        }
        return true;
    }
}