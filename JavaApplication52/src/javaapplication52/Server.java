/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication52;

import static javaapplication52.JavaApplication52.L;
import static javaapplication52.JavaApplication52.T;
import static javaapplication52.JavaApplication52.b;
import static javaapplication52.JavaApplication52.tSum;

/**
 *
 * @author swtoskon
 */
public class Server {
    Queue aQueue=new Queue();
    boolean isAvailable=true;
    int max=0 ; 
    
    public void SevingClearance(int numOfCustomer){
          double startTime=T+Random.exponential(8.0);
          L.insert(startTime,"Afiksi",numOfCustomer+2);
          b.add(startTime);
       if(isAvailable){
            double endService = T+Random.exponential(3.0);
               L.insert(endService,"Telos eksipiretisis",numOfCustomer+1);
          isAvailable=false;
      }
      else{
          aQueue.insertElement(numOfCustomer);
           if (max < aQueue.findNumberOfElements())
              max = aQueue.findNumberOfElements();
      }
         
    }
    
    public void ClearQueue(int numOfCustomer){
         double endService;
          if(!aQueue.list.isEmpty()){
              aQueue.removeElement();
                    endService = T+Random.exponential(3.0);
                   L.insert(endService,"Telos eksipiretisis",numOfCustomer+2);
                    tSum = tSum+endService;
          }
          else{
              isAvailable=true;
          }
   
}

   
}
