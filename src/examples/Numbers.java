/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.math.BigInteger;
/**
 *
 * @author fabio
 */
public class Numbers {
    public static void main(String[] args){
        
        long a = 123456789;
        long b = 123_456_789;
        
        System.out.println(a==b);
        
        System.out.println(Long.MAX_VALUE);
        
        BigInteger c = new BigInteger("2");
        BigInteger d = new BigInteger("1");
        
       
        
        
        
    }
}
