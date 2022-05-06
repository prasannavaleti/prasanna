package facebook.controller;

import java.util.ArrayList;

import facebook.entity.FacebookUser;

public interface FacebookControllerInterface {

	int createProfileController();

	FacebookUser viewProfileController();

	int deleteProfileController();

	ArrayList<FacebookUser> viewAllProfileController();

	int editProfileController();

	ArrayList<FacebookUser> searchProfileController();

	ArrayList<FacebookUser> sortProfileController();

}
