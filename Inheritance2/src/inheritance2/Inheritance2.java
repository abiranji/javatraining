/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance2;

/**
 *
 * @author ranjee
 */
public class Inheritance2 {
float salary=20000;
}
class company extends Inheritance2
{
    int bonus=5000;
    public static void main(String[] args) {
      company c = new company();
    System.out.println("the salary is :"+c.salary);
    
    System.out.println("the bonus is:"+c.bonus);
    
    }
    
}
