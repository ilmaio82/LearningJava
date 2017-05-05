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
public class ArrayEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int[] myArray = new int[]{1,2,3,4,5};
        int[] myArray;
        myArray = new int[5];
        
        String[] sArray;
        sArray = new String[10];
        
        for(int i=0; i<sArray.length;i++){
            sArray[i] = "dfcmpoo5%W$%YesaASDFAF";
        }
        
        System.out.println(sArray.toString());
        
        /*
        for(int i=0; i<(myArray.length);i++){
            myArray[i]=i+3;
        }
        */
        
        /*for(int val:myArray){
        //for(int i=0; i<(myArray.length);i++){
            if(i==myArray.length){
                System.out.println("Ultimo!");
            }
            //System.out.println("i="+i);
            //System.out.println(myArray[i]);
            System.out.println(val);
        }*/
    }
}
   
