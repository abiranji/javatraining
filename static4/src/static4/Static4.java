/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package static4;

/**
 *
 * @author ranjee
 */
public class Static4 {

    static void display()
    {
        System.out.println("static method is called using classname without creating a object ");
    }
    
    
    public static void main(String[] args) {
        Static4.display();
    }
    
}
