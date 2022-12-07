/*
* File: Koszon.java
* Author: Gyüre Árpád
* Copyright: 2022, Gyüre Árpád
* Group: Szoft I-1-E
* Date: 2022-12-07
* Github: https://github.com/rp2022k/java1
*/

import java.io.*;
public class Koszon{
    public static void main(String[] args) throws IOException{
	String userName;

	BufferedReader br=
        new BufferedReader(new InputStreamReader(System.in, "852"));

	System.out.print("Írd be a felhasználó nevet: ");
        userName=br.readLine();
	System.out.println("Üdvözöllek "+userName);
        }
}