/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factdemo;

/**
 *
 * @author ranjee
 */
public class FactDemo {
int f;
FactDemo()
{
    f=1;
}
void cal(int n)
{
    for(int i=1;i<=n;i++)
        f=f*i;
}
void display()
{
    System.out.println(f);
}
    public static void main(String[] args)
    {
        FactDemo f =new FactDemo();
        f.cal(5);
        f.display();
    }
}
    }
       
    
}
