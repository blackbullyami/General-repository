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

/*class Two_methods{
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
}*/

/*Question:
Write a program that calculates and prints the value according to the given formula:
Q = Square root of [(2 * C * D)/H]
Following are the fixed values of C and H:
C is 50. H is 30.
D is the variable whose values should be input to your program in a comma-separated sequence.
Example
Let us assume the following comma separated input sequence is given to the program:
100,150,180
The output of the program should be:
18,22,24

Hints:
If the output received is in decimal form, it should be rounded off to its nearest value (for example,
 if the output received is 26.0, it should be printed as 26)
In case of input data being supplied to the question, it should be assumed to be a console input.*/
/*class formula{
    public int formual1(int d){
    int c=50,h=30;
    int q=(int)Math.sqrt(((2*c*d)/h));
    return Math.round(q);

    }
}
public class java_question{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your comma seperated numbers here ");
    String str=sc.nextLine();
    sc.close();
    String[] arr=str.split(",");
    formula object=new formula();

    for(String x:arr){
        int i=Integer.parseInt(x);
        int b=object.formual1(i);
        System.out.print(b+",");

    }

}

}*/

/*Level 2

Question:
Write a program which takes 2 digits, X,Y as input and generates a 2-dimensional array. The element value in the i-th row and j-th column of the array should be i*j.
Note: i=0,1.., X-1; j=0,1,¡­Y-1.
Example
Suppose the following inputs are given to the program:
3,5
Then, the output of the program should be:
[[0, 0, 0, 0, 0], [0, 1, 2, 3, 4], [0, 2, 4, 6, 8]] */
/*public class java_question{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of rows;-"+" ");
        int rows=sc.nextInt();
        System.out.print("Enter number of column;-"+" ");
        int column=sc.nextInt();
        sc.close();
        int[][] arr=new int[rows][column];
        for (int i=0;i<rows;i++){
            for (int j=0;j<column;j++){
              arr[i][j]=i*j;

            }
        }
        for (int i=0;i<rows;i++){
            System.out.print("[");
            for(int j=0;j<column;j++){
                System.out.print(arr[i][j]+",");
            }
            System.out.print("]"+" ");
        }


        

    }
}*/
