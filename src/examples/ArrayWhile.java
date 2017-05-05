/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

/**
 *
 * @author fabio
 */
public class ArrayWhile {
    public static void main(String[] args){
        
        String[] myArray = new String[4];
        myArray[0]="a";
        myArray[1]="b";
        myArray[2]="c";
        myArray[3]="d";
        int index = 0;

        while(index < myArray.length)
        {
          final String value;

          value = myArray[index];
          System.out.println(value);
          index++;
        }
    }
}
