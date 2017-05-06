/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.util.Random;
/**
 *
 * @author fabio
 */
public class RandomString2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String sResult = "";
        int strLength = 30;
        
        // Creo la stringa contenente tutti i possibili caratteri
        String sSymbols = "";
        int i = 0;
        //caratteri a-z
        for(char c ='a'; c <='z'; c++){            
            sSymbols = sSymbols+c;
            i++;
        }
        //caratteri A-Z
        for(char c ='A'; c <='Z'; c++){            
            sSymbols = sSymbols+c;
            i++;
        }
        //caratteri 0-9
        for(char c ='0'; c <='9'; c++){            
            sSymbols = sSymbols+c;
            i++;   
        }
        
        //creo la stringa prendendo valori casuali dalla stringa dei simboli costruita sopra
        int j=0;
        Random rand = new Random();
        while (j < strLength){
            int k = rand.nextInt(sSymbols.length());
            sResult= sResult+sSymbols.charAt(k);
            j++;
        }
        System.out.println(sResult);
    }
}
   
