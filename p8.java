
import java.util.*;

class Demo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int sum =0;
        for(int i =1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.print("Perfect Number : "+n);
        }else{
            System.out.print("not a perfect number...");
        }

    }

    
}
