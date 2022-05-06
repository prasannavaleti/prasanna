package com.Ajay.View;

import java.util.Scanner;

import com.Ajay.Controller.AjayController;
import com.Ajay.Controller.AjayControllerInterface;

public class AjayView {

	public static void main(String[] args) {
		String s="y";
		while(s.contentEquals("y")) {
		System.out.println("********************MAIN MENU******************");
		System.out.println("Press 1  to create profile");
		System.out.println("press 2 to view profile");
		System.out.println("press 3 to delete profile");
		System.out.println("press 4 to view all profiles");
		System.out.print("Enter your choice : ");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		AjayControllerInterface ac = new AjayController();
		switch(ch)
		{
		case 1:
			ac.createProfileController();
			break;
		case 2:
			ac.viewProfileController();
			break;
		case 3:
			ac.deleteProfileController();
			break;
		case 4:
			ac.viewAllProfileController();
			break;
		default:
			System.out.println("wrong choice");
		}
		System.out.print("do you want to continue press y/n : ");
		s=sc.next();
		}
	}

}
