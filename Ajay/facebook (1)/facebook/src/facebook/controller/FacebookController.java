package facebook.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import facebook.entity.FacebookUser;
import facebook.service.FacebookService;
import facebook.service.FacebookServiceInterface;
import facebook.utility.SortByName;



public class FacebookController implements FacebookControllerInterface {

	@Override
	public int createProfileController() {
		System.out.println("profile is creating: ");
		Scanner sc=new Scanner(System.in);
        
		
		System.out.println("Enter name: ");
        String name=sc.next();
        
        System.out.println("Enter password: ");
        String password=sc.next();
        
        System.out.println("Enter email: ");
        String email=sc.next();
        
        System.out.println("Enter address: ");
        String address=sc.next();
        
        
        
        FacebookUser fu=new FacebookUser();
    	fu.setName(name);
    	fu.setPassword(password);
    	fu.setEmail(email);
    	fu.setAddress(address);
    	
    	FacebookServiceInterface fs=new FacebookService();
    	int i=fs.createProfileService(fu);
    	
    	if(i>0) {
    		System.out.println("profile created");
    		System.out.println();
    	}
    	else {
    		System.out.println("could not create profile");
    	}
		return i;
		
		
		
	}

	@Override
	public FacebookUser viewProfileController() {
		System.out.println("profile is viewing: ");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Email whose profile you wish to view: ");
		String email=sc.next();
		
		FacebookUser fu=new FacebookUser();
		fu.setEmail(email);
		
		FacebookServiceInterface fs=new FacebookService();
		FacebookUser user=fs.viewProfileService(fu);
		
		if(user!=null) {
			System.out.println("Name is "+user.getName());
			
			
			System.out.println("Password is "+user.getPassword());
			System.out.println("Email is "+user.getEmail());
			System.out.println("Address is "+user.getAddress());
			System.out.println();
		}
		else {
			System.out.println("profile not found");
		}
		return user;
		
	}

	@Override
	public int deleteProfileController() {
		System.out.println("profile is deleting: ");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Email whose profile you wish to delete: ");
		String email=sc.next();
		
		FacebookUser fu=new FacebookUser();
		fu.setEmail(email);
		
		FacebookServiceInterface fs=new FacebookService();
		int i=fs.deleteProfileService(fu);
		
		if(i>0) {
			System.out.println("profile deleted");
			System.out.println();
		}
		else {
			System.out.println("could not delete profile");
		}
		return i;
		
	}

	@Override
	public ArrayList<FacebookUser> viewAllProfileController() {
		System.out.println("view all profile");
		Scanner sc=new Scanner(System.in);
		
		FacebookUser fu=new FacebookUser();
		
		FacebookServiceInterface fs=new FacebookService();
		ArrayList<FacebookUser> lis=fs.viewAllProfileService(fu);
		
		System.out.println(lis.size() +"records found in database");
		for(FacebookUser i:lis) {
			System.out.println("********************");
			System.out.println("Name is "+i.getName());
			System.out.println("Password is "+i.getPassword());
			System.out.println("Email is "+i.getEmail());
			System.out.println("Address is "+i.getAddress());
			System.out.println();
		}
		
		if(lis.size()==0){
			System.out.println("No records found");
		}
		return lis;
		
		
	}

	@Override
	public int editProfileController() {
		System.out.println("editing the profile: ");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Email whose profile you wish to edit");
		String email=sc.next();
		
		System.out.println("Edit name: ");
		String name=sc.next();
		
		System.out.println("Edit password: ");
		String password=sc.next();
		
		System.out.println("Enter address: ");
		String address=sc.next();
		
		FacebookUser fu=new FacebookUser();
		fu.setEmail(email);
		
		FacebookUser fu1=new FacebookUser();
		fu1.setName(name);
		fu1.setPassword(password);
		fu1.setAddress(address);
		
		
		FacebookServiceInterface fs=new FacebookService();
		int i=fs.editProfileService(fu,fu1);
		
		if(i>0) {
			System.out.println("profile edited");
			System.out.println();
		}
		else {
			System.out.println("could not edit profile");
		}
		return i;
	}

	@Override
	public ArrayList<FacebookUser> searchProfileController() {
		System.out.println("searching the profile");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a name whose profile you wish to search: ");
		String name=sc.next();
		
		FacebookUser fu=new FacebookUser();
		fu.setName(name);
		
		FacebookServiceInterface fs=new FacebookService();
		ArrayList<FacebookUser> lis=fs.searchProfileService(fu);
		
		if(lis!=null) {
			for(FacebookUser user : lis) {
			System.out.println("***************");
			System.out.println("Name is "+user.getName());
			System.out.println("Password is "+user.getPassword());
			System.out.println("Email is "+user.getEmail());
			System.out.println("Address is "+user.getAddress());
			System.out.println();
			}
		}
		else {
			System.out.println("No profiles found with the given name");
		}
		return lis;
		
		
		
	}

	@Override
	public ArrayList<FacebookUser> sortProfileController() {
		System.out.println("sorting the profile: ");
		ArrayList<FacebookUser> lis = new ArrayList<FacebookUser>();
		
		FacebookServiceInterface fs=new FacebookService();
		lis = fs.sortProfileService();
		Collections.sort(lis, new SortByName());
		
		for (FacebookUser user : lis) {
			System.out.println("____________________");
			System.out.println("Name is " + user.getName());
			System.out.println("Password is "+ user.getPassword());
			System.out.println("Email is " + user.getEmail());
			System.out.println("Address is " + user.getAddress());
			System.out.println();
		}
		return lis;
		
		
	}
	
}

