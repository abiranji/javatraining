/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package static5;

/**
 *
 * @author ranjee
 */
public class Static5 {

   static int z=5;
   void display()
   {
       z--;
       System.out.println(z);
   }
  
    public static void main(String[] args) {
      Static5 a= new Static5();
      a.display();
      a.display();
      Static5 b=new Static5();
      b.display();
      b.display();
      b.display();
      Static5 c=new Static5();
      c.display();
      c.display();
      c.display();
      c.display();
    }
}
      
    
    
}
