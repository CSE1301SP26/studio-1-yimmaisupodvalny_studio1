package studio1;

import java.util.Scanner;

public class LeapYear {

public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
System.out.println("Enter a year");
int Year = in.nextInt();
boolean isLeapYear = (Year % 4 ==0) && (Year % 100 != 0) || (Year % 400 == 0);
System.out.println(isLeapYear);
}
}