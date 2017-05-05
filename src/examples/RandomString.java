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
public class RandomString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0;
        String sResult = "";
        int strLength = 30;
        
        // Creo l'array contenente tutti i possibili caratteri della stringa
        char[] aSymbols = new char[62];
       
        //caratteri a-z
        for(char c ='a'; c <='z'; c++){            
            aSymbols[i] = c;
            i++;
        }
        
        //caratteri A-Z
        for(char c ='A'; c <='Z'; c++){            
            aSymbols[i] = c;
            i++;
        }

        //caratteri 0-9
        for(char c ='0'; c <='9'; c++){            
            aSymbols[i] = c;
            i++;   
        }
        
        //creo la stringa prendendo valori casuali dall'array costruito sopra
        int j=0;
        Random rand = new Random();
        while (j < strLength){
            int k = rand.nextInt(aSymbols.length);
            sResult= sResult+aSymbols[k];
            j++;
        }
        System.out.println(sResult);
    }
}
   
