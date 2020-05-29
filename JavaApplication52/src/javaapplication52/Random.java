/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication52;

import java.math.BigInteger;

/**
 *
 * @author swtoskon
 */
public class Random {
    final  static BigInteger a= new BigInteger("1664525");
       final static  BigInteger c= new BigInteger("1013904223");
       final static long  n= (long)Math.pow(2, 32); 
        final static BigInteger m= new BigInteger(""+ n + "");
        static BigInteger seed = new BigInteger("178271");
        
        public static BigInteger Next(BigInteger previus){
       return (previus.multiply(a).add(c).mod(m));
      }
     
      static double exponential(double mean) {
          float u = (float)Next(seed).longValue()/m.longValue();
          seed = Next(seed);
        return - (1/mean) * Math.log(1-u);
    }
    
}
