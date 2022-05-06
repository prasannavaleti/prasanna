package com.Ajay.Service;

import java.util.ArrayList;

import com.Ajay.DAO.AjayDAO;
import com.Ajay.DAO.AjayDAOInterface;
import com.Ajay.Entity.Ajayuser;

public class AjayService implements AjayServiceInterface {

	public int createProfileService(Ajayuser au) {
		AjayDAOInterface ad = new AjayDAO();
		int i = ad.createProfileDAO(au);
		return i;
	}

	public Ajayuser viewProfileService(Ajayuser au) {
		AjayDAOInterface ad=new AjayDAO();
		Ajayuser u1=ad.viewProfileDAO(au);
		return u1;
	}

	public int deleteProfileService(Ajayuser au) {
		AjayDAOInterface ad = new AjayDAO();
		int i = ad.deleteProfileDAO(au);
		return i;
	}

	public ArrayList<Ajayuser> viewAllProfileService() {
		AjayDAOInterface ad=new AjayDAO();
		ArrayList<Ajayuser> lis=ad.viewAllProfileDAO();
		return lis;
	}

}
