

import java.util.Scanner;

public class Main{
	 public static void main(String[] args) {
		 System.out.println(avg(1,1,1));}
		 Scanner sc=new Scanner(System.in); 
		 static double avg(double... num) {
			 double s=0;
		 
			 for(double n:num) {
				 s+=n;
			 }
			return s/num.length;
		 }
		
	 }
	 
	