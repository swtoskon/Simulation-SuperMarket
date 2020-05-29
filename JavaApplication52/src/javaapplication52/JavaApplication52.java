/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication52;

import java.util.ArrayList;

/**
 *
 * @author swtoskon
 */
public class JavaApplication52 {

    /**
     * @param args the command line arguments
     */
   public  static double T=0;
   public static eventsQueue L = new eventsQueue();
  public static  ArrayList<Double> b = new ArrayList();
  public static double  tSum=0;
    public static void main(String[] args) {
      
       int N=0;
       int i=0;
       int j=0;
       int NMAX =4;
       double a = Random.exponential(8.0);
       L.insert(a,"Afiksi", 1);
       b.add(a);
       Server s = new Server();
       Server s2=null;
       while(T<3){
             System.out.println("Event Queue Now");
             L.print();
             if(s.aQueue.findNumberOfElements()>=NMAX){
                  s2 = new Server();
                 s2.SevingClearance(s.aQueue.getfirstElement());
                 
             }
           if(L.head.name.equals("Telos eksipiretisis")){
               T=L.head.data;
               int cust = L.head.numOfCumstomer;
              L.extract();
              if(s2!=null && cust==s2.aQueue.getfirstElement()){
                  s2.ClearQueue(cust);
              }
              else{
              s.ClearQueue(j);
              }
               N=N-1;
               j++;
               tSum=tSum-b.get(j);
               //if(j>NMAX)break;
           }
           else{
               T= L.head.data;
               L.extract();
               if(s2!=null){
                   if(s2.aQueue.findNumberOfElements()<s.aQueue.findNumberOfElements()){
                       s2.SevingClearance(i+1);
                   }
                   else{
                       s.SevingClearance(i+1);
                   }
               }
               else{
               s.SevingClearance(i+1);
               }
              N++;
             i++;
            
    }
       s.aQueue.print();
        if(s2!=null ) s2.aQueue.print();
       }
 System.out.println(s.max);
    if(s2!=null )System.out.println(s2.max);
      
   System.out.println(tSum/j);
            
  }
}
    


