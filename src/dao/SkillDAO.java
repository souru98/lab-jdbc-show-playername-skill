
package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO
{
	 public Skill getSkillBylD(Long id) throws ClassNotFoundException, SQLException, IOException 
	{
		 Connection con=ConnectionManager.getConnection();
		 
		 Statement stmt=  con.createStatement();
			
			
			ResultSet rs =stmt.executeQuery("select * from skills ");
			Skill skill=new Skill();
			while(rs.next())
			{
				long id1=rs.getLong(1);
				if(id1==id)
				{
				
				String name=rs.getString(2);
				
				
				skill.setSkilld(id1);
				skill.setSkillName(name);
				
				return skill;
				}
				
				
			}
		
		return null;
	 
	}
	 
}
