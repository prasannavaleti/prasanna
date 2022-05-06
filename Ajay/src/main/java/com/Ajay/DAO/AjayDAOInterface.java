package com.Ajay.DAO;

import java.util.ArrayList;

import com.Ajay.Entity.Ajayuser;

public interface AjayDAOInterface {

	int createProfileDAO(Ajayuser au);

	Ajayuser viewProfileDAO(Ajayuser au);

	int deleteProfileDAO(Ajayuser au);

	ArrayList<Ajayuser> viewAllProfileDAO();

}
