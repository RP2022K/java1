/*
* File: Teglatest.java
* Author: Gyüre Árpád
* Copyright: 2022, Gyüre Árpád
* Group: Szoft I-1-E
* Date: 2022-12-07
* Github: https://github.com/rp2022k/java1
*/

import java.io.*;
public class Teglatest {
    public static void main(String[] args) throws IOException{
        int a, b, c;

        BufferedReader br=
        new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Írd be a téglatest éleinek hosszát!");
	System.out.print("a= ");
        a=Integer.parseInt(br.readLine());
        System.out.print("b= ");
        b=Integer.parseInt(br.readLine());
	System.out.print("c= ");
        c=Integer.parseInt(br.readLine());

        System.out.println("A téglatest felszíne: "+2*((a * b) + (a * c) + (b * c)));
	System.out.println("A téglatest térfogata: "+(a * b * c));
    }
}
