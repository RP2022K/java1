/*
* File: LehetHaromszog.java
* Author: Gyüre Árpád
* Copyright: 2022, Gyüre Árpád
* Group: Szoft I-1-E
* Date: 2022-12-07
* Github: https://github.com/rp2022k/java1
*/

import java.io.*;
public class LehetHaromszog {
    public static void main(String[] args) throws IOException{
        double a, b, c;

        BufferedReader br=
        new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Írd be az első oldalát a háromszögnek: ");
        a=Double.parseDouble(br.readLine());
        System.out.print("Írd be a második oldalát a háromszögnek: ");
        b=Double.parseDouble(br.readLine());
        System.out.print("Írd be a harmadik oldalát a háromszögnek: ");
        c=Double.parseDouble(br.readLine());

        if ( (a+b) >= c && (a+c) >= b && (b+c) >= a )
            System.out.println("A háromszög megszerkeszthető!");
        else 
            System.out.println("A háromszög nem szerkeszthető meg!");
    }
}
