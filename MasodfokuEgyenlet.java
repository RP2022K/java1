/*
* File: MasodfokuEgyenlet.java
* Author: Gyüre Árpád
* Copyright: 2022, Gyüre Árpád
* Group: Szoft I-1-E
* Date: 2022-12-07
* Github: https://github.com/rp2022k/java1
*/

import java.io.*;
public class MasodfokuEgyenlet {
    public static void main(String[] args) throws IOException{
        int a, b, c;
	double d;

        BufferedReader br=
        new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Írd az első egyutthatót: ");
        a=Integer.parseInt(br.readLine());
	System.out.print("Írd be a második együtthatót: ");
        b=Integer.parseInt(br.readLine());
	System.out.print("Írd be a harmadik együtthatót: ");
        c=Integer.parseInt(br.readLine());

	d = (b * b) - (4 * a * c);
	
	if (d >= 0){
		    System.out.println("Az egyenlet megoldása:  x1 = "+String.format("%.3f", (double) ((-b + Math.sqrt(d)) / (2*a))));
		    if (d != 0) System.out.println("\t\t\t"+"x2 = "+String.format("%.3f", (double) ((-b - Math.sqrt(d)) / (2*a))));
		}
	else System.out.println("Az egyenletnek nincs megoldása!");
    }
}
