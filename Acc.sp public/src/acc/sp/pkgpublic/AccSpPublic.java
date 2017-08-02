/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acc.sp.pkgpublic;

/**
 *
 * @author ranjee
 */
public class AccSpPublic {
    public void add(int n,int m)
    {
        System.out.println((n+m));
    }

    class Second extends AccSpPublic
    {
        void sub(int x,int y)
        {
            
            System.out.println((x-y));
        }
    }
    public static void main(String[] args) {
        Second s=new Second();
        s.add(10,10);
        s.sub(10, 90);
    }
}
}
