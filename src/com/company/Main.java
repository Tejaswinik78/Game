package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

	
	
	

	public static void main(String[] args) {
		
		 @SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		 System.out.println("0 is for rock");
		 System.out.println("1 is for paper");
		 System.out.println("2 is for scissor");
		 
		 int computer_choice;
		 int computerwon=0;
		 int my_choice;
		 int me=0;
		 int game=1;
		 @SuppressWarnings("unused")
		int bound;
		 
		 while(game<=5) {
			 
			 Random rand =new Random();
			 
			
			
			computer_choice = rand.nextInt(bound=2);
			 my_choice= sc.nextInt();
			 //my choice 
			 switch (my_choice)
			 {
			 case 0:
				 System.out.println("you choose rock");
				 break;
			 case 1:
				 System.out.println("you choose paper");
				 break;
			 case 2:
				 System.out.println("you chose scissor");
				 break;
				 
			 }
			 
			//computer choice  
			 switch (computer_choice) {
			 case 0:
				 System.out.println("computer choose rock");
				 break;
			 case 1:
				 System.out.println("computer choose paper");
				 break;
			 case 2:
				 System.out.println("computer chose scissor");
				 break;

			 
			 }
			 if(computer_choice==my_choice) {
				 System.out.println("match tie");
				 
			 }
			 else if(computer_choice==0&&my_choice==1) {
				 System.out.println("i won !!! computer lose");
				 me++;
				 
			 }
			 else if(computer_choice==0 && my_choice==2) {
				 System.out.println("computer won !! i lose");
				 computerwon++;
				 
			 }
			 else if (computer_choice==1&& my_choice==0) {
				 System.out.println("computer won");
				 computerwon++;
				 
			 }
			 else if(computer_choice==1 && my_choice==2) {
				 System.out.println("i won");
				 me++;
				 
			 }else if (computer_choice==2&& my_choice==0) {
				 System.out.println("i won");
				 me++;
			 }
			 else if(computer_choice==2 && my_choice==1) {
				 System.out.println("computer won");
				 computerwon++;
			 }
			 if(game==5) {
				 break;
			 }
			 game++;
		 }
		 System.out.println("---------------------------------------------------");
		 System.out.println("computer"+":"+computerwon);
		 System.out.println("me"+":"+me);
		 
		 System.out.println("---------------------------------------");
		 if(computerwon>me) {
			 System.out.println("computer won the game");
			 
		 }else if(computerwon==me) {
			 System.out.println("match tie");
			 
		 }else
		 {
			System.out.println("i won the game"); 
		 }
		 
	}

}

