/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package1;


public class Package1 {
    public void add(int a,int b)
    {
        int c=a+b;
        System.out.println(c);
    }
           
    
    
import Package1.*;
class maindemo{
   
    public static void main(String[] args) {
      Package1 p=new Package1();
      p.add(10, 40);
      
    }
    
}
