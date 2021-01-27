package test;

import java.util.Random;
import java.util.Scanner;

public class Backjun {
	public static void main() {
	      // TODO Auto-generated method stub
	      char grade='A';
	      func();
	      for(int i=0;i<3;i++) {
	         for(int j=0;j<5;j++) {
	            int sum=0;
	            int avg=0;
	            sum += arr[i][j];
	            avg=(sum/3);
	            
	            if((avg<=100)&&(avg>=90)) 
	               grade ='A';
	            
	            else if((avg<=89)&&(avg>=80))
	               grade = 'B';
	            else if((avg<=79)&&(avg>=70))
	               grade = 'C';   
	            else if((avg<=69)&&(avg>=60))
	               grade = 'D';
	            else if((avg<=59)&&(avg>=50))
	               grade = 'E';
	            else
	               grade ='F';
	         
	         System.out.println("√—¡°¿∫" +sum);
	         System.out.println("∆Ú±’¿∫"+avg);
	         System.out.println("«–¡°¿∫"+ grade);
	         }   
	   }
	   }
	   public static void func() {
	      Random r = new Random();
	      int arr[][] = new int[3][5];
	      for (int i = 0; i < arr.length; i++) {
	         for (int j = 0; j < arr[i].length; j++) {
	            arr[i][j] = (int) (Math.random() * 100) + 1;
	         }
	      }
	      
	      

	   }


}
