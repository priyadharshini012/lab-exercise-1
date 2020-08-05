/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;


/**
 *
 * @author WINDOWS
 */
public class smalllarge {
public static void main(String[]args)
{
    int large,small,i;
    int a[]=new int[]{1,2,3,4,5};
    int n=a.length;
    large=small=a[0];
    for(i=0;i<n;i++)
    {
        if(a[i]>large)
            large=a[i];
        if(a[i]<small)
            small=a[i];
    }
    System.out.print("\n The smallest element is"+small);
    System.out.print("\n The largest element is"+large);
    }
    
}
    

