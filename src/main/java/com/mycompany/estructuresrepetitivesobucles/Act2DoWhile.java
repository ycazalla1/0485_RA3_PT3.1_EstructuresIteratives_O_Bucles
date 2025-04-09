/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructuresrepetitivesobucles;
import java.util.Scanner;
/**
 *
 * @author Bagner i Yamila
 */
public class Act2DoWhile {
    
    public static void main(String[] args) {
        
        int numero;
        int j = 0;
        int i = 1;
        
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Introdueix un número gran: ");
        numero = lector.nextInt();
        
        while (j == 0) {
            if (numero >= 10){
                do {
                    System.out.println(i + ". Estaré atent classe.");
                    i = i + 1;
                    j = j + 1;
                } while (i <= numero);
            } else {
                System.out.println("És un número massa petit. Torna'l a escriure. -> ");
                numero = lector.nextInt();
            }
        }
    }
}
