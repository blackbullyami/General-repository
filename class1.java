 import java.util.Scanner;
// calculating factorial using recursive approach 

public class class1 {
    static long facrec(long n){
        if (n==1 || n==0){
            return (1);
        }
        else {
            return n*facrec(n-1);
        }
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter your number :-");
        long x=s.nextLong();
        System.out.println("your factorial of x is:"+" "+facrec(x));
    }

}