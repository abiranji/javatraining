/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author ranjee
 */
public class INheritance {
   
    
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
}           
class main extends INheritance
{
   void sub(int n,int m)
   {
       System.out.println(n-m);
       
   }
 public static void main(String[] args) {
       
    main m1=new main();
m1.add(50,50);
m1.sub(70, 60);
    }
    
}
