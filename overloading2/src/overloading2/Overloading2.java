/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading2;

/**
 *
 * @author ranjee
 */
public class Overloading2 {
   
static int add(int a, int b){return a+b;}  
static double add(double a, double b){return a+b;}  
 

public static void main(String[] args){  
System.out.println(Overloading2.add(10,11));  
System.out.println(Overloading2.add(12.3,12.4));  
}}  

 
