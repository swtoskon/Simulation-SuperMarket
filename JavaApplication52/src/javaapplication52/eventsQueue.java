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
public class eventsQueue {
    Node head;
    
    public void insert(double data,String name,int num){
        Node cur=head;
        Node pred =null;
        boolean done=false;
        while(cur!=null && !done){
            if(cur.data>data){
                done =true;
            }
            else{
                pred=cur;
                cur = cur.next;
            }
        }
        Node n = new Node(data,name,num);
        n.data = data;
        if(pred==null){
            n.next=head;
            head=n;
        }
        else{
            n.next=pred.next;
            pred.next=n;
        }
        
        
    }
    public void extract(){
        Node temp=head;
        head=temp.next;
    }
    
    public void print(){
        Node cur=head;
        while(cur!=null){
            System.out.println(cur.data + " " + cur.name + " " + cur.numOfCumstomer);
            
            cur=cur.next;
        }
    }
    
    public boolean isEmpty(){
        return head==null;
    }
}
