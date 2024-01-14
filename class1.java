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

/*public class class1{
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
}*/

//Question:
//Define a class which has at least two methods:
//getString: to get a string from console input
//printString: to print the string in upper case.
//Also please include simple test function to test the class methods.

class Two_methods{
    public String getString(String n){
        return n;

    }
    public void printString(String n){
        String u=n.toUpperCase();
        System.out.println(u);
    }
}
public class class1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String");
        String n=sc.nextLine();
        Two_methods object=new Two_methods();
        System.out.println(object.getString(n));
        object.printString(n);



    }
}