/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;
import java.util.*;

/**
 *
 * @author WINDOWS
 */ 


public class switchcase {
    
public static void main(String[] args)
{
  Scanner obj=new Scanner(System.in);
  int marks=obj.nextInt();

switch(marks)
{
 case 10: 
System.out.println("excellent");
break;
case 9:
case 8:    
System.out.println("very good");
break;
case 7:
case 6:    
System.out.println("good");
break;
case 5:
case 4:
case 3:    
System.out.println("poor");
break;
case 2:
case 1:
case 0:
System.out.println("very poor");
break;
default:
System.out.println("invalid value entry");
}
}
}

 
 
