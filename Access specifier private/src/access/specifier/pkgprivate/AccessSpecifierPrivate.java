/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access.specifier.pkgprivate;

/**
 *
 * @author ranjee
 */
 class AccessSpecifierPrivate {
private void display(int a,int b)
{
    System.out.println((a+b));
}
 }
   Class Maindemo 
           { 
    public static void main(String[] args) {
       AccessSpecifierPrivate obj=new AccessSpecifierPrivate();
       obj.display(10,10);
    }
    
}
