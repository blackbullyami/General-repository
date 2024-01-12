 import java.util.Scanner;
 import java.util.ArrayList;
// calculating factorial using recursive approach 

/*public class class1 {
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

}*/

//Write a program which will find all such numbers which are divisible by 7 but are not a multiple of 5, 
//between 2000 and 3200 (both included).
//The numbers obtained should be printed in a comma-separated sequence on a single line.

public class class1{
    public static void main(String args[]){
        ArrayList <Integer> t=new ArrayList<Integer>();
        for (int i=2001;i<3200;i++){
            if (i%7==0 && i%5!=0){
               t.add(i); 

            }
        }
        for (int x:t){
            System.out.print(x+",");
        }
    }
}