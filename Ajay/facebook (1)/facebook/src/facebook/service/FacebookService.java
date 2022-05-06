package facebook.service;

import java.util.ArrayList;

import facebook.dao.FacebookDAO;
import facebook.dao.FacebookDAOInterface;
import facebook.entity.FacebookUser;

public class FacebookService implements FacebookServiceInterface {

	@Override
	public int createProfileService(FacebookUser fu) {
		FacebookDAOInterface fd=new FacebookDAO();
		int i=fd.createProfileDAO(fu);
		return i;
	}


	@Override
	public FacebookUser viewProfileService(FacebookUser fu) {
		FacebookDAOInterface fd=new FacebookDAO();
		FacebookUser user=fd.viewProfileDAO(fu);
		return user;
	}


	@Override
	public int deleteProfileService(FacebookUser fu) {
		FacebookDAOInterface fd=new FacebookDAO();
		int i=fd.deleteProfileDAO(fu);
		return i;
	}


	@Override
	public ArrayList<FacebookUser> viewAllProfileService(FacebookUser fu) {
		FacebookDAOInterface fd=new FacebookDAO();
		ArrayList<FacebookUser> lis=fd.viewAllProfileDAO(fu);
		return lis;
	}


	@Override
	public int editProfileService(FacebookUser fu, FacebookUser fu1) {
		FacebookDAOInterface fd=new FacebookDAO();
		int i=fd.editProfileDAO(fu,fu1);
		return i;
	}


	@Override
	public ArrayList<FacebookUser> searchProfileService(FacebookUser fu) {
		FacebookDAOInterface fd=new FacebookDAO();
		ArrayList<FacebookUser> lis=fd.searchProfileDAO(fu);
		return lis;
		
		
	}


	@Override
	public ArrayList<FacebookUser> sortProfileService() {
		FacebookDAOInterface fd=new FacebookDAO();
		ArrayList<FacebookUser> lis=fd.sortProfileDAO();
		return lis; 
	}

	
	

}
