import java.util.Scanner;
import  java.util.ArrayList;


public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList();
        names.add("100");
        names.add("200");
        names.add("300");
        names.add("400");
        names.add("500");
        names.add("600");
        names.add("700");
        names.add("800");
        names.add("900");
        names.add("1000");


        for (String name : names)
        {
            System.out.println(name);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter value of array: ");
        int newvalue = scanner.nextInt();

        try{ ArrayList[10] = newvalue; System.out.println("" +ArrayList[10]);}

       catch ( Exception e) { System.out.println("Something went wrong");}
    }
}

