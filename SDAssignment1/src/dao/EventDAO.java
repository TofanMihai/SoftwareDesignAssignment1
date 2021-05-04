package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import connection.ConnectionFactory;
import objects.Event;

public class EventDAO extends AbstractDAO<Event> 
{
	private String getEventByDatesQuery = "SELECT * FROM assignment1sd.event WHERE date BETWEEN ? AND ? ORDER BY date, hour";
	private String getEventByWeekQuery = "SELECT * FROM assignment1sd.event WHERE week = ? ORDER BY date,hour";
	private String getEventQuery = "SELECT * FROM assignment1sd.event ORDER BY date,hour";

	
	public ResultSet getEventsByDates(Date date1, Date date2)
	{
		PreparedStatement st = null;
		ResultSet result = null;
		Connection connect = ConnectionFactory.getConnection();
		
    	String dateString1 = new SimpleDateFormat("yyyy-MM-dd").format(date1);
    	String dateString2 = new SimpleDateFormat("yyyy-MM-dd").format(date2);
		
		try 
		{
			st = connect.prepareStatement(getEventByDatesQuery);
			st.setString(1, dateString1);
			st.setString(2, dateString2);
			System.out.println(st);
				
			result = st.executeQuery();
		    return result;
			
		}
		catch (SQLException e)
		{
			
			e.printStackTrace();
			return result;
			
		}
	  }
	
	public ResultSet getEventsByWeek(int week)
	{
		PreparedStatement st = null;
		ResultSet result = null;
		Connection connect = ConnectionFactory.getConnection();
		

		
		try 
		{
			st = connect.prepareStatement(getEventByWeekQuery);
			st.setInt(1, week);
			System.out.println(st);
			result = st.executeQuery();
		    return result;
			
		}
		catch (SQLException e)
		{
			
			e.printStackTrace();
			return result;
			
		}
	  }
	
	public ResultSet getEvents()
	{
		PreparedStatement st = null;
		ResultSet result = null;
		Connection connect = ConnectionFactory.getConnection();
		

		
		try 
		{
			st = connect.prepareStatement(getEventQuery);

			System.out.println(st);
			result = st.executeQuery();
		    return result;
			
		}
		catch (SQLException e)
		{
			
			e.printStackTrace();
			return result;
			
		}
	  }
	
}
	
	

