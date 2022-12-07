/*
* File: Alapmuveletek.java
* Author: Gyüre Árpád
* Copyright: 2022, Gyüre Árpád
* Group: Szoft I-1-E
* Date: 2022-12-07
* Github: https://github.com/rp2022k/java1
*/

import java.io.*;
public class Alapmuveletek {
    public static void main(String[] args) throws IOException{
        int szam1, szam2;

        BufferedReader br=
        new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Kérem az első számot: ");
        szam1=Integer.parseInt(br.readLine());
	System.out.print("Kérem a második számot: ");
        szam2=Integer.parseInt(br.readLine());
        System.out.println("A két szám összege: "+(szam1+szam2));
	System.out.println("A két szám különbsége: "+(szam1-szam2));
	System.out.println("A két szám szorzata: "+(szam1*szam2));
	if (szam2 != 0)
		System.out.println("hányadosa: " + String.format("%.3f", (double) szam1 / szam2));
	else System.out.println("A nullával nem osztunk!");
    }
}
