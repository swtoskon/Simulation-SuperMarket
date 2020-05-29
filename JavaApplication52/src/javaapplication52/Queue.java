/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication52;

import java.util.LinkedList;

/**
 *
 * @author swtoskon
 */
public class Queue {
     LinkedList list =new LinkedList();
    
    public void insertElement(int num){
        list.addLast(num);
    }
    
    public void removeElement(){
          list.removeFirst();
    }
    public int getfirstElement(){
          if(this.findNumberOfElements()==0) return 0;
          int x = (int) list.getFirst();
          return x;
    }
    public int findNumberOfElements(){
        return list.size();
    }
    
    public void print(){
        System.out.println(list);
    }
  
    }

