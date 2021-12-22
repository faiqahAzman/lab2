/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labproject2;

import java.util.*;
/**
 *
 * @author user
 */
public class Q2 {
    
    
  
    
    static void sumOfPower(long x)
{
    ArrayList<Integer> v = new ArrayList<Integer>();
     
    // Convert decimal number to
    // its binary equivalent
    System.out.print(x+" = ");
    while (x > 0)
    {
        v.add((int)x % 2);
        x = x / 2;
    }
 
    // Displaying the output when
    // the bit is '1' in binary
    // equivalent of number.
    for (int i = 0; i < v.size(); i++)
    {
        if (v.get(i) == 1)
        {
        int calc=(int) Math.pow(2,i);
        System.out.print(calc);
            if (i != v.size() - 1)
            System.out.print( " + ");
        }
    }
    
    System.out.println();
}
    public static void main(String args[])
{
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter integer: ");
    long x = input.nextInt();
    
    sumOfPower(x);
    
    
    
    
   
}

    
}


