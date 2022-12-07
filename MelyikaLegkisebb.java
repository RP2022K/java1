/*
* File: MelyikaLegkisebb.java
* Author: Gyüre Árpád
* Copyright: 2022, Gyüre Árpád
* Group: Szoft I-1-E
* Date: 2022-12-07
* Github: https://github.com/rp2022k/java1
*/

import java.io.*;
public class MelyikaLegkisebb {
    public static void main(String[] args) throws IOException{
        int[] tomb = new int[3];
        int legkisebb;

        BufferedReader br=
        new BufferedReader(new InputStreamReader(System.in));

	legkisebb = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            System.out.print("Kérem a(z) "+(i+1)+"."+" számot: ");
            tomb[i] = Integer.parseInt(br.readLine());
	    if (tomb[i] < legkisebb) legkisebb = tomb[i];
            }
	System.out.print("A legkisebb szám: "+legkisebb);
    }
}