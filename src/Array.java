import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

       int[] anArray = new int [10];
       anArray [0] = 100;
       anArray [1] = 200;
       anArray [2] = 300;
       anArray [3] = 400;
       anArray [4] = 500;
       anArray [5] = 600;
       anArray [6] = 700;
       anArray [7] = 800;
       anArray [8] = 900;
       anArray [9] = 1000;

       for (int i =0; i < anArray.length; i++)
       {
           System.out.println(anArray[i]);
       }
       Scanner scanner = new Scanner(System.in);
       System.out.println("Please enter value of array: ");
       int newvalue = scanner.nextInt();
try
{anArray[10] = newvalue; System.out.println("" +anArray[10]);}
catch ( Exception e)
{
System.out.println("Something went wrong");

}
    }
}
