package facebook.service;

import java.util.ArrayList;

import facebook.entity.FacebookUser;

public interface FacebookServiceInterface {

	int createProfileService(FacebookUser fu);

	FacebookUser viewProfileService(FacebookUser fu);

	int deleteProfileService(FacebookUser fu);

	ArrayList<FacebookUser> viewAllProfileService(FacebookUser fu);

	int editProfileService(FacebookUser fu, FacebookUser fu1);

	ArrayList<FacebookUser> searchProfileService(FacebookUser fu);

	ArrayList<FacebookUser> sortProfileService();

}
