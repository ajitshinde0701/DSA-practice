
import java.util.*;

class Demo{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        for(int i =2;i<=n/2;i++){
            if(n%i==0)
                System.out.print(i+" ");
        }
    }
}