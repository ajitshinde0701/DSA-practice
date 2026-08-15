
import java.util.*;

class Demo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        boolean isDuck = false;
        
        if(isDuckNum(n)==true){
            System.out.print("Duck number");

        }else{
            System.out.print("Not a Duck number");
        }
        
    }
    static boolean isDuckNum(int n){
        int rem = n % 10;
        n/=10;

        if(rem == 0){
            return true;
        }
        return false;

    }
}
