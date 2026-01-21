package studio1;

import java.util.Scanner;

public class Average {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    System.out.println("The first of two integers to be averaged?");
    int n1 = in.nextInt();
    int n2 = in.nextInt();

    double Average = (n1+n2)/2.0;

    System.out.print("The average of " + n1 + " and " + n2 + " is " + Average);

}
}
