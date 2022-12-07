/*
* File: KorivTeruletHossz.java
* Author: Gyüre Árpád
* Copyright: 2022, Gyüre Árpád
* Group: Szoft I-1-E
* Date: 2022-12-07
* Github: https://github.com/rp2022k/java1
*/

import java.io.*;
public class KorivTeruletHossz {
    public static void main(String[] args) throws IOException{
        double sugar, szog;

        BufferedReader br=
        new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Írd be a körív sugarat: ");
        sugar=Double.parseDouble(br.readLine());
	System.out.print("Írd be a középponti szöget: ");
        szog=Double.parseDouble(br.readLine());

        System.out.println("A körív területe: "+String.format("%.3f",(sugar*sugar*Math.PI*(szog/360))));
	System.out.println("A határoló ív hossza: "+String.format("%.3f",(2*sugar*Math.PI*(szog/360))));
    }
}
