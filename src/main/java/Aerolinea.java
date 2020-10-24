/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author davig
 */
public class Aerolinea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // client info
        Scanner input = new Scanner(System.in);
        String client1;
        String client2;
        int flightn1;
        int flightn2;

        //status of flight
        boolean delayed1;
        boolean delayed2;

        //discount due to delayed flight
        String discount = "Dear passengers we would like to offer or most sincere apologies for the "
                + "delay\nand we would like to give you a 25% discount for your troubles.\n"
                + "Please use offer code 25DELAY on your next purchase ";
        
        System.out.println("Welcome to Garcia Aerolines");
       
        //client 1
        System.out.println("Please enter your name");
        client1 = input.next();
        System.out.println("Welcome " + client1 + " please enter your flight number");
        flightn1 = input.nextInt();
        System.out.println(client1 + " is your flight delayed? (true or false)");
        delayed1 = input.nextBoolean();

        //client 2
        System.out.println("Please enter the name of the second passenger");
        client2 = input.next();
        System.out.println("Welcome " + client2 + " please enter your flight number");
        flightn2 = input.nextInt();
        System.out.println(client2 + " is your flight delayed? (true or false)");
        delayed2 = input.nextBoolean();

        if (delayed1 && delayed2 == true) {
            System.out.println(client1);
            System.out.println(flightn1);
            System.out.println(client2);
            System.out.println(flightn2);
            System.out.println(discount);
            System.out.println("*");
            System.out.println(" *");
            System.out.println("  *");
            System.out.println("   *");
            System.out.println("    *");
            System.out.println("     *");
            System.out.println("*******");

        } else {
            System.out.println(client1);
            System.out.println(flightn1);
            System.out.println(client2);
            System.out.println(flightn2);
        }

        
    }

}
