/*
* File: SzamtaniMertaniKozep.java
* Author: Gyüre Árpád
* Copyright: 2022, Gyüre Árpád
* Group: Szoft I-1-E
* Date: 2022-12-07
* Github: https://github.com/rp2022k/java1
*/

import java.io.*;
public class SzamtaniMertaniKozep {
    public static void main(String[] args) throws IOException{
        int szam1, szam2;

        BufferedReader br=
        new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Kérem az első számot: ");
        szam1=Integer.parseInt(br.readLine());
	System.out.print("Kérem a második számot: ");
        szam2=Integer.parseInt(br.readLine());
        System.out.println("A két szám számtani közepe: "+String.format("%.3f", (double) (szam1 + szam2)/2));
	System.out.println("A két szám mértani közepe: "+String.format("%.3f", (double) Math.sqrt(szam1 * szam2)));
    }
}
