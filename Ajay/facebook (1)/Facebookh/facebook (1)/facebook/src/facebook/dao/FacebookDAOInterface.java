package facebook.dao;

import java.util.ArrayList;

import facebook.entity.FacebookUser;

public interface FacebookDAOInterface {

	int createProfileDAO(FacebookUser fu);

	FacebookUser viewProfileDAO(FacebookUser fu);

	int deleteProfileDAO(FacebookUser fu);

	ArrayList<FacebookUser> viewAllProfileDAO(FacebookUser fu);

	int editProfileDAO(FacebookUser fu, FacebookUser fu1);

	ArrayList<FacebookUser> searchProfileDAO(FacebookUser fu);

	ArrayList<FacebookUser> sortProfileDAO();
     
	


	


}
