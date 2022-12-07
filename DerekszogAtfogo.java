/*
* File: DerekszogAtfogo.java
* Author: Gyüre Árpád
* Copyright: 2022, Gyüre Árpád
* Group: Szoft I-1-E
* Date: 2022-12-07
* Github: https://github.com/rp2022k/java1
*/

import java.io.*;
public class DerekszogAtfogo {
    public static void main(String[] args) throws IOException{
        double a, b;

        BufferedReader br=
        new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Írd be a háromszög egyik befogóját: ");
        a=Double.parseDouble(br.readLine());
        System.out.print("Írd be a háromszög másik befogóját: ");
        b=Double.parseDouble(br.readLine());

        System.out.println("Az átfogó hossza: "+String.format("%.2f", Math.sqrt((a * a) + (b * b))));
    }
}
