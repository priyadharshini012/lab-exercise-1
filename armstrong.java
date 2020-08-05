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

public class armstrong
{
     
    public static void main(String[] args) {
        int num=153,n,temp,total=0;
        n=num;
        while(n!=0)
        {
            temp=n%10;
            total=total+temp*temp*temp;
            n/=10;
        }
        if(total==num)
            System.out.println(num+"is an armstrong number");
        else
            System.out.println(num+"is not an armstrong number");
        }
        
    }
