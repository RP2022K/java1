/*
* File: MelyikNagyobb.java
* Author: Gyüre Árpád
* Copyright: 2022, Gyüre Árpád
* Group: Szoft I-1-E
* Date: 2022-12-07
* Github: https://github.com/rp2022k/java1
*/

import java.io.*;
public class MelyikNagyobb {
    public static void main(String[] args) throws IOException{
        int elso, masodik;

        BufferedReader br=
        new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Írd be az első számot: ");
        elso=Integer.parseInt(br.readLine());
        System.out.print("Írd be a második számot: ");
        masodik=Integer.parseInt(br.readLine());

        if (elso>masodik){
            System.out.println("Az első szám a nagyobb: "+elso);
        } else if (masodik>elso){
            System.out.println("A második szám a nagyobb: "+masodik);
        } else {System.out.println("A két szám egyenlő");
            }
        }
    }