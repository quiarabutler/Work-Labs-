package hellojava;

import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = s.nextInt();
        if ( age >= 18){
            System.out.println("You are old enough.");
        }else {
            int yearsToWait = 18 - age;
            if (yearsToWait == 1){
            System.out.println("You must be one year older to enter");
            }else {
                System.out.println("You must be " + yearsToWait + " years older to enter.");

                s.close();
            }
        }

    }
}
