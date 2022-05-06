package facebook.view;

import java.util.Scanner;

import facebook.controller.FacebookController;
import facebook.controller.FacebookControllerInterface;

public class FacebookView {
   public static void main(String[]args) {
	   String s="y";
	   while(s.contentEquals("y")) {
	   System.out.println("*****************MAIN MENU*************************");
	   System.out.println("press 1 to create profile");
	   System.out.println("press 2 to view profile");
	   System.out.println("press 3 to delete profile");
	   System.out.println("press 4 to viewAll profile");
	   System.out.println("press 5 to edit profile");
	   System.out.println("press 6 to search profile");
	   System.out.println("press 7 to sort profile");
	  
	   
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter your choice: ");
	   int ch=sc.nextInt();
	   
	   FacebookControllerInterface ff=new FacebookController();
	   
	   switch(ch) {
	   case 1: ff.createProfileController();
		   break;
	   case 2:ff.viewProfileController();
		   break;
	   case 3:ff.deleteProfileController();
		   break;
	   case 4:ff.viewAllProfileController();
		   break;
	   case 5:ff.editProfileController();
		   break;
	   case 6:ff.searchProfileController();
	   
		   break;
	   case 7:ff.sortProfileController();
		   break;
	   default:System.out.println("wrong choice");
	   }
	   System.out.println("Do you want to continue press y/n");
	   s=sc.next();
	   
	   }
   }
}
