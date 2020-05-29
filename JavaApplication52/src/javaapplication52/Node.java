/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication52;

/**
 *
 * @author swtoskon
 */
public class Node{
        Node next;
        String name;
        double data;
        int numOfCumstomer;

         Node(double num,String event,int customer) {
            data = num;
            name = event;
           numOfCumstomer=customer;
        }
        
    }
