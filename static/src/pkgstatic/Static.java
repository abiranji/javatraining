/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgstatic;

/**
 *
 * @author ranjee
 */
public class Static {
    

   static int a=1;
   void calc()
   {
       a++;
       System.out.println(a);
   }
    public static void main(String[] args) {
       Static s1 = new Static();
       s1.calc();
       s1.calc();
       s1.calc();
       Static s2 = new Static();
       s2.calc();
       s2.calc();
       
    }          
    }
    
}
