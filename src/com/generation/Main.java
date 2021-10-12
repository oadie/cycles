package com.generation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// for cycle
        /*for (i = 0; i < num; i++){
            //contador
        }
         */
    /*
        Scanner sc = new Scanner(System.in);
        System.out.println("type a number to get his multiplication table");
        int num = sc.nextInt();
        sc.close();

        for(int i = 1; i < 11; i++){
            System.out.println(i + " * " + num + " = " + (num*i));
        }

     */

    /*
        Scanner sc2 = new Scanner(System.in);
        System.out.println("type a number and get the Fibonacci behind it");
        int x = sc2.nextInt();
        sc2.close();
        int a=0, b=1, ab=0;
        System.out.println(a +"\n"+ b);

        for(int e=2; e < x; ++e) {
            ab=a+b;
            System.out.print(ab + "\n");
            a=b;
            b=ab;
        }

     */

    /*
        Scanner sc3 = new Scanner(System.in);
        System.out.println("guess the secret number");
        int guess = sc3.nextInt();
        int sn = 500;

        while(sn != guess){
            System.out.println("try it again, guess the secret number");
            guess = sc3.nextInt();
        }
        System.out.println("your guess is correct, congrats! the secret number is: " + sn);
        sc3.close();

     */

    /*
        Scanner sc4 = new Scanner(System.in);
        int sn2=6, guess2=0;
        do{
            System.out.println("guess the secret number");
            guess2 = sc4.nextInt();
        }while (guess2 != sn2);
        System.out.println("your guess is correct, congrats! the secret number is: " + sn2);
        sc4.close();

     */

        Scanner sc5 = new Scanner(System.in);
        System.out.println("type a number and obtain his factorial");
        int input= sc5.nextInt(), start=0, fac=0;
        sc5.close();

        while (start<input){
            fac = start * input;
            start++;
        }

        System.out.println(input + "! = "+ fac);

    }

}
