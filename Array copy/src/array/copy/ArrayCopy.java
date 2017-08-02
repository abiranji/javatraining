/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.copy;

/**
 *
 * @author ranjee
 */
public class ArrayCopy 
{
    
    public static void main(String[] args) {
        char[] CopyFrom={'d','e','f','a','b'};
        char[] CopyTo=new char[3];
        System.arraycopy(CopyFrom,1,CopyTo,0,3);
        System.out.println(new String(CopyTo));
       }
    
}
