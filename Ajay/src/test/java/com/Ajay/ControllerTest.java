package com.Ajay;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.Ajay.Controller.AjayController;
import com.Ajay.Entity.Ajayuser;

public class ControllerTest {
	AjayController ac = null;
	@Before
	public void setUp() throws Exception {
		ac = new AjayController();
	}
	@After
	public void tearDown() throws Exception {
		ac=null;
	}
	@Test
	public void testCreateProfileController() {
		int i = ac.createProfileController();
		assert i>0:"Fail to create profile";
	}

	@Test
	public void testViewProfileController() {
	Ajayuser user = ac.viewProfileController();
		assert user!= null:"test failed to view profile";
	}

	@Test
	public void testDeleteProfileController() {
		int i = ac.deleteProfileController();
		assert i>0: "Test failed to delete profile";
	}

	@Test
	public void testViewAllProfileController() {
		ArrayList<Ajayuser> lis = ac.viewAllProfileController();
		assert lis!= null: "Test failed to view all profiles";
	}

}
