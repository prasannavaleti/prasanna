package com.Ajay.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.Ajay.Entity.Ajayuser;
import com.Ajay.Exception.UserDefineException;

public class AjayDAO implements AjayDAOInterface {

	public int createProfileDAO(Ajayuser au) {
		int i=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Sravani");
			if(au.getName().equals("Governemnt")) {
				throw new UserDefineException();
			}
			PreparedStatement st =con.prepareStatement("insert  into Ajayuser values(?,?,?,?)");
			st.setString(1, au.getName());
			st.setString(2, au.getPassword());
			st.setString(3,au.getEmail());
			st.setString(4,au.getAddress());
			i=st.executeUpdate(); 
		}

		catch(UserDefineException e)
		{
			System.out.println(e);
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		//finally {
			
		//}
		
		return i;
	}
	public Ajayuser viewProfileDAO(Ajayuser au) {
		//Ajayuser u1=null;
		Ajayuser s2 = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Sravani");
			
			PreparedStatement st=con.prepareStatement("select * from Ajayuser where email=?");
			st.setString(1,au.getEmail());
			ResultSet res=st.executeQuery();
			if(res.next()) {
				//u1=new Ajayuser();
				String n=res.getString(1);
				String p=res.getString(2);
				String e=res.getString(3);
				String a=res.getString(4);
				s2 = new Ajayuser();
				s2.setName(n);
				s2.setPassword(p);
				s2.setEmail(e);
				s2.setAddress(a);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return s2;
	}
	public int deleteProfileDAO(Ajayuser au) {
		int i=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Sravani");
			PreparedStatement st =con.prepareStatement("delete from Ajayuser where email = ?");
			st.setString(1,au.getEmail());
			
			i=st.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}
	public ArrayList<Ajayuser> viewAllProfileDAO() {
		ArrayList<Ajayuser> lis = new ArrayList<Ajayuser>();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Sravani");
			
			PreparedStatement st=con.prepareStatement("select * from Ajayuser");

			ResultSet res=st.executeQuery();
			while(res.next()) {
				String n=res.getString(1);
				String p=res.getString(2);
				String e=res.getString(3);
				String a=res.getString(4);
				Ajayuser s2 = new Ajayuser();
				s2.setName(n);
				s2.setPassword(p);
				s2.setEmail(e);
				s2.setAddress(a);
				lis.add(s2);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return lis;
	}

}

