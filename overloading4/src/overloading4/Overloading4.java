/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading4;

/**
 *
 * @author ranjee
 */
public class Overloading4 {

   
    
  void sum(int a,float b){System.out.println(a+b);}  
  void sum(int a,int b,int c){System.out.println(a+b+c);}  
  
  public static void main(String args[]){  
  Overloading4 obj=new Overloading4();  
  obj.sum(20,20);  
  obj.sum(20,20,20); 
        
    }
    
}
