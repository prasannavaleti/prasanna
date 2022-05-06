package facebook.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import facebook.entity.FacebookUser;

public class FacebookDAO implements FacebookDAOInterface {

	@Override
	public int createProfileDAO(FacebookUser fu) {
		int i=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@CHANDUNANI:1521:XE","system","orcl");
			
			PreparedStatement ps=con.prepareStatement("insert into FacebookUser values(?,?,?,?)");
			ps.setString(1,fu.getName());
			ps.setString(2,fu.getPassword());
			ps.setString(3,fu.getEmail());
			ps.setString(4,fu.getAddress());
			
			i=ps.executeUpdate();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return i;
	}


	@Override
	public FacebookUser viewProfileDAO(FacebookUser fu) {
		FacebookUser user=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@CHANDUNANI:1521:XE","system","orcl");
			
			PreparedStatement ps=con.prepareStatement("select * from FacebookUser where email=?");
			ps.setString(1 , fu.getEmail());
			
			ResultSet res=ps.executeQuery();
			if(res.next()) {
				String n=res.getString(1);
				String p=res.getString(2);
				String e=res.getString(3);
				String a=res.getString(4);
				
				user =new FacebookUser();
				user.setName(n);
				user.setPassword(p);
				user.setEmail(e);
				user.setAddress(a);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return user;
	}


	@Override
	public int deleteProfileDAO(FacebookUser fu) {
		int i=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@CHANDUNANI:1521:XE","system","orcl");
			
			PreparedStatement ps=con.prepareStatement("delete from FacebookUser where email = ?");
			ps.setString(1,fu.getEmail());
			
			i=ps.executeUpdate();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return i;
	}


	@Override
	public ArrayList<FacebookUser> viewAllProfileDAO(FacebookUser fu) {
		ArrayList<FacebookUser> lis=new ArrayList<FacebookUser>();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@CHANDUNANI:1521:XE","system","orcl");
			
			PreparedStatement ps=con.prepareStatement("select * from FacebookUser");
			
			
			ResultSet res=ps.executeQuery();
			if(res.next()) {
				String n=res.getString(1);
				String p=res.getString(2);
				String e=res.getString(3);
				String a=res.getString(4);
				
				FacebookUser user=new FacebookUser();
				user.setName(n);
				user.setPassword(p);
				user.setEmail(e);
				user.setAddress(a);
				
				lis.add(user);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return lis;
	
	}


	@Override
	public int editProfileDAO(FacebookUser fu,FacebookUser fu1) {
		int i=0;
	    try {
	    	Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@CHANDUNANI:1521:XE","system","orcl");
			
			PreparedStatement ps=con.prepareStatement("update FacebookUser set name=? ,password=? ,address=? where email = ?");
			ps.setString(1,fu1.getName());
			ps.setString(2,fu1.getPassword());
			ps.setString(3,fu1.getAddress());
			ps.setString(4, fu.getEmail());
			
			i=ps.executeUpdate();
	    	
	    }
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}


	@Override
	public ArrayList<FacebookUser> searchProfileDAO(FacebookUser fu) {
		ArrayList<FacebookUser> lis=new ArrayList<FacebookUser>();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@CHANDUNANI:1521:XE","system","orcl");
			
			PreparedStatement ps=con.prepareStatement("select * from FacebookUser where name=?");
			ps.setString(1, fu.getName());
			
			ResultSet res=ps.executeQuery();
			
			while(res.next()) {
		    String n=res.getString(1);
			String p=res.getString(2);
			String e=res.getString(3);
			String a=res.getString(4);
			
			FacebookUser user=new FacebookUser();
			user.setName(n);
			user.setPassword(p);
			user.setEmail(e);
			user.setAddress(a);
			
			lis.add(user);
			
			}
				
				
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return lis;
	}


	@Override
	public ArrayList<FacebookUser> sortProfileDAO() {
		ArrayList<FacebookUser> lis=new ArrayList<FacebookUser>();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@CHANDUNANI:1521:XE","system","orcl");
			
			PreparedStatement ps=con.prepareStatement("select * from FacebookUser");
			
			ResultSet res=ps.executeQuery();
			
			while(res.next()) {
		    String n=res.getString(1);
			String p=res.getString(2);
			String e=res.getString(3);
			String a=res.getString(4);
			
			FacebookUser user=new FacebookUser();
			user.setName(n);
			user.setPassword(p);
			user.setEmail(e);
			user.setAddress(a);
			
			lis.add(user);
			
			}
				
				
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return lis;
	}

}
