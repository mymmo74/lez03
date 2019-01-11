/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lez03;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class Confronto {

    // Leggere in input due numeri interi e stampare il maggiore
    public static void main(String[] args) {

        // per prendere un input da tastiera
        // Strumento della piattaforma Java, libreria WebAPI
        Scanner s = new Scanner(System.in);
        System.out.println("Inserisci il primo numero: ");

        int op1 = s.nextInt();

        System.out.println("Inserisci il secondo numero: ");

        int op2 = s.nextInt();

        if (op1 == op2) {
            System.out.println("I numeri sono uguali");
        } else if (op1 > op2) {
            System.out.println("Il numero massimo inserito è: " + op1);

        } else {
            System.out.println("Il numero massimo inserito è: " + op2);
        }

    }

}
