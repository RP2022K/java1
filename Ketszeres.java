/*
* File: Ketszeres.java
* Author: Gyüre Árpád
* Copyright: 2022, Gyüre Árpád
* Group: Szoft I-1-E
* Date: 2022-12-07
* Github: https://github.com/rp2022k/java1
*/

import java.io.*;
public class Ketszeres {
    public static void main(String[] args) throws IOException{
        int szam;

        BufferedReader br=
        new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Írj be egy számot: ");
        szam=Integer.parseInt(br.readLine());
        System.out.print("A beírt szám kétszerese: "+szam*2);
    }
}
