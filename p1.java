import java.util.*;

class Demo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int temp =n;
        int original = n;
        int count =0;
        int sum= 0;

        while(temp>0){
            count++;
            temp/=10;
        }

        while(n>0){
            int rem = n%10;

            sum += Math.pow(rem,count);
            count--;
            n/=10;  
        }

        if(sum == original ){
            System.out.println("true");
        }
        else{
            System.out.println(original + " false");
        }
    }
}