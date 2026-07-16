
import java.util.*;

class Demo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the nummber : ");

        int n = sc.nextInt();
        
        int arr[] = new int[n];

        System.out.print("Enter the array elements : ");

        for(int i = 0; i<n ;i++){
            arr[i]= sc.nextInt();
        }
        for(int i =0;i<n;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]+" is even number");
            }
            else{
                System.out.println(arr[i]+" is odd number");
            }
        }

    }
}