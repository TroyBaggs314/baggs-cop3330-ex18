/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Troy Baggs
 */

package org.example;
import java.util.Scanner;
import java.lang.Character;

class Temp
{
    boolean Celsius;
    double temp;
}

public class Exercise18
{
    public static void main( String[] args )
    {
        Temp t = new Temp();
        t = inputs(t);
        String out = (t.Celsius == true) ? "The temperature in Celsius is ": "The temperature in Fahrenheit is ";
        t.temp = (t.Celsius == true) ? (t.temp - 32) * (5/9) : (t.temp * 5/9) + 32;
        System.out.println(out + t.temp);
    }

    public static Temp inputs(Temp t)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.\nYour choice: ");
        char temp = Character.toLowerCase(sc.next().charAt(0));
        if(temp == 'c')
        {
            t.Celsius = true;
            System.out.println("Please enter the temperature in Fahrenheit");
        }
        else if(temp == 'f')
        {
            t.Celsius = false;
            System.out.println("Please enter the temperature in Celsius");
        }
        t.temp = sc.nextInt();
        return t;
    }
}
