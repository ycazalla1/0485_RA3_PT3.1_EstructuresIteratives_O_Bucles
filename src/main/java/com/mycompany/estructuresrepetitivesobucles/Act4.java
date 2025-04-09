/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estructuresrepetitivesobucles;
import java.util.Scanner;
/**
 *
 * @author Bagner i Yamila
 */
public class Act4 {

    public static void main(String[] args) {
        
        int suma = 0; //Declarem variable int per realitzar la suma total del km.
        int ordre = 1; //Declarem variable int per anar incrementant el valor del print.
        boolean comprovacio = false; //Variable boolean per realitzar la comprovació del bucle.
        String ciutat1; //Variable string que recull la primera ciutat introduïda.
        String ciutat2; //Variable string que recull la segona ciutat introduïda.
        
        //Sout per imprimir un títol.
        System.out.println("-----Càlcul de quilòmetres-----");
        
        do { //DoWhile que es torna a realitzar si la condició és falsa.
            
            //Declarem una varieble de tipus Scanner perquè l'usuari puguin introduir un valor.
            Scanner lector = new Scanner(System.in);
            
            //Sout per preguntar la primera ciutat.
            System.out.print("Entra el nom de la " + ordre + "ª ciutat: ");
            ciutat1 = lector.nextLine(); //Ordre per introduir una ciutat.
            
            ordre += 1; //Incrementa el valor de ordre, perque passi el següent número.
            
            //Sout per preguntar la segona ciutat.
            System.out.print("Entra el nom de la " + ordre + "ª ciutat: ");
            ciutat2 = lector.nextLine(); //Ordre per introduir una ciutat.
            
            //Sout per preguntat la distància entre les dues ciutats introduïdes.
            System.out.print("Entra la distància en quilòmetres entre " + 
                    ciutat1 + " i " + ciutat2 + ": ");
            int km = lector.nextInt(); //Variable int per introduir la quantitat de km.
            
            suma += km; //Càlcul que va sumant els km, que vegada que es realitza el bucle.
            
            //Sout per preguntat si es vol introduir una altra ciutat.
            System.out.println("Vols afegir una altra ciutat? (sí/no): ");
            System.out.println("\t1. Sí");
            System.out.println("\t2. No");
            System.out.print("Selecció: ");
            int resposta = lector.nextInt(); //Variable int per introduir la opció triada.
            
            //Switch que realitza una acció segons la resposta introduïda.
            switch (resposta) {
                case 1: //1. Sí: Només incrementa el valor de ordre i no surt del bucle.
                    ordre += 1;
                    break;
                case 2: //2. No: Canvia el valor de comprovació per sortir del bucle.
                    comprovacio = true;
                    break;
                default: /*Sout per dir que està malament el valor introduït.
                Es realitza el bucle de nou.*/
                    System.out.println("Valor incorrecte. Prova una altre vegada");
                    
            }
            
        } while (!comprovacio);
        
        //Sout per imprimir el resultat de la quantitat de km recorreguts.        
        System.out.print("Distància total recorreguda: " + suma + " quilòmetres.");
        
        
    }
}
