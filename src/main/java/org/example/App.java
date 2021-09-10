/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Meola
 */

package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println( "What is the quote?" );
        String Quote = scan.nextLine();
        System.out.println("Who said it?");
        String Person = scan.nextLine();
        System.out.println( Person + " says, " + "\"" + Quote + "\"" );

    }


}
