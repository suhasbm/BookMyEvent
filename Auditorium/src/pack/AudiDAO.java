package pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AudiDAO {
	public static ArrayList<Audi> getAllEvents()
	{
		ArrayList<Audi> eventList =new ArrayList<Audi>();
		Audi audi=null;
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521/xe","system","tiger");  
			      
			PreparedStatement ps=con.prepareStatement(
			"select * from audi ");   
			
			      
			ResultSet rs=ps.executeQuery();  
			while(rs.next())
			{
				System.out.println(rs.getString(2)+rs.getInt(1));
				audi=new Audi(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5),rs.getString(6));
				eventList.add(audi);
			}
			
			  
			
			}catch(Exception e){System.out.println(e);} 
		
		
		
		
		return eventList;
	}
	
	public static ArrayList<Audi> getByCategory(String category)
	{
		ArrayList<Audi> eventList =new ArrayList<Audi>();
		Audi audi=null;
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521/xe","system","tiger");  
			      
			PreparedStatement ps=con.prepareStatement(
			"select * from audi where category=?");   
			ps.setString(1,category);  
			
			      
			ResultSet rs=ps.executeQuery();  
			while(rs.next())
			{
				System.out.println(rs.getString(2)+rs.getInt(1));
				audi=new Audi(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5),rs.getString(6));
				eventList.add(audi);
			}
			
			  
			
			}catch(Exception e){System.out.println(e);} 
		
		
		
		
		return eventList;
	}
	
	public static Audi getEventBean(String eventid)
	{
		
		Audi audi=null;
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521/xe","system","tiger");  
			      
			PreparedStatement ps=con.prepareStatement(
			"select * from audi where eventid=?");   
			ps.setString(1,eventid);  
			
			      
			ResultSet rs=ps.executeQuery();  
			while(rs.next())
			{
				
				audi=new Audi(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5),rs.getString(6));
			
			}
			
			  
			
			}catch(Exception e){System.out.println(e);} 
		
		
		
		
		return audi;
	}
	public static boolean updateAudi(String eventid,String quantity)
	{
		
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521/xe","system","tiger");  
			      
			PreparedStatement ps=con.prepareStatement(
					"update audi set quantity=quantity-? where eventid=?");   
 			ps.setString(1,quantity);  
			ps.setString(2,eventid);  
			ResultSet rs=ps.executeQuery();  
			if(rs.next())
			{
				System.out.println("Update done ..qty");
				return true;
				
			}
			  
			
			}catch(Exception e){System.out.println(e);} 
		
		
		
		
		return false;
	}
}
