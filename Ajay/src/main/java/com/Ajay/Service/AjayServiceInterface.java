package com.Ajay.Service;

import java.util.ArrayList;

import com.Ajay.Entity.Ajayuser;

public interface AjayServiceInterface {

	int createProfileService(Ajayuser au);

	Ajayuser viewProfileService(Ajayuser au);

	int deleteProfileService(Ajayuser au);

	ArrayList<Ajayuser> viewAllProfileService();

}
