package com.Ajay.Controller;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

import com.Ajay.Entity.Ajayuser;
import com.Ajay.Service.AjayService;
import com.Ajay.Service.AjayServiceInterface;

public class AjayController implements AjayControllerInterface {
	Logger log=Logger.getLogger("AjayController");
	//final static Logger log = Logger.getLogger(AjayController.class);
	public int createProfileController() {
		log.info("inside create profile method of controller");
		Scanner sc = new Scanner(System.in);
		log.info("Enter name");
		String name = sc.next();
		
		log.info("Enter password");
		String password = sc.next();
		
		log.info("Enter email");
		String email = sc.next();
		
		log.info("Enter address");
		String address = sc.next();
		
		Ajayuser au = new Ajayuser();
		au.setName(name);
		au.setPassword(password);
		au.setEmail(email);
		au.setAddress(address);
		AjayServiceInterface as = new AjayService();
		int i = as.createProfileService(au);
		
		if(i>0)
		{
			log.info("profile created");
		}
		else
		{
			log.info("could not create profile");
		}
		return i;
	}

	public Ajayuser viewProfileController() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter email which profile you want to see");
		String email=sc.next();
		
		Ajayuser au=new Ajayuser();
		au.setEmail(email);
		
		AjayServiceInterface as=new AjayService();
		Ajayuser u1=as.viewProfileService(au);
		
		if(u1!=null) {
			System.out.println("Name is "+u1.getName());
			System.out.println("Password is "+u1.getPassword());
			System.out.println("Email is "+u1.getEmail());
			System.out.println("Address is "+u1.getAddress());
		}
		else {
			System.out.println("profile not found");
		}
		return u1;
	}

	public int deleteProfileController() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the email whose profile you wish to delete : ");
		String email = sc.next();
		
		Ajayuser au = new Ajayuser();
		au.setEmail(email);
		
		AjayServiceInterface as = new AjayService();
		int i = as.deleteProfileService(au);
		
		if(i>0)
		{
			System.out.println("profile deleted");
		}
		else
		{
			System.out.println("could not delete profile");
		}
		return i;
		
		
	}

	public ArrayList<Ajayuser> viewAllProfileController() {
		
//		Ajayuser au = newAjayuser();
		AjayServiceInterface as=new AjayService();
		ArrayList<Ajayuser> lis =as.viewAllProfileService();
		
		System.out.println(lis.size() + " records found in database");
		
		if(lis.size() > 0) {
			for (Ajayuser i : lis) {
				System.out.println("*****************************");
				System.out.println("Name is "+i.getName());
				System.out.println("Password is "+i.getPassword());
				System.out.println("Email is "+i.getEmail());
				System.out.println("Address is "+i.getAddress());
			}
		}
		else {
			System.out.println("No profiles found in database");
		}
		return lis;
	}


}
