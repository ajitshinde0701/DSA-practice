// the given numbers difference of the product and sum


import java.util.*;

class Demo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int sum =0;
        int product = 1;

        while(n>0){
            int rem = n%10;
            sum+=rem;
            product*=rem;

            n/=10;
        }

        System.out.print("Sum of the given n number digit : "+sum);
        System.out.println();
        System.out.print("Product of the given n number digit : "+product);
        System.out.println();
        int difference = product - sum;
        System.out.print("The difference of the given product and the sum of the given number : " + difference);
    
    }
}