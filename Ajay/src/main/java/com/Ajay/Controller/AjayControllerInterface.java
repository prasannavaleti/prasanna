package com.Ajay.Controller;

import java.util.ArrayList;

import com.Ajay.Entity.Ajayuser;

public interface AjayControllerInterface {

	int createProfileController();
	Ajayuser viewProfileController();

	int deleteProfileController();

	ArrayList<Ajayuser> viewAllProfileController();

	 

}
