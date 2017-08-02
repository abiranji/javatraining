/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylarg;

/**
 *
 * @author ranjee
 */
public class ArrayLarg {
    int a[]={55,77,89,98,05};
    int max=a[0];
    for(int i=1;i<a.length;i++)
    {
        if(a[i]>max)
        {
            max=a[i];
            System.out.println("Largest no in an array"+max);
        }
    }
}
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
