/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;
import java.util.Scanner;

/**
 *
 * @author fabio
 */
public class Readline {
    public static void main(String[] args){
        System.out.println("scrivi una frase");
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        System.out.println("Hai scritto: "+frase);
    }
}
