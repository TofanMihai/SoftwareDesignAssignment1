package bll;
import static java.time.temporal.ChronoUnit.MINUTES;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import dao.EventDAO;
import objects.Event;

public class EventBLL
{
	public EventDAO eventDAO;
	
	public EventBLL()
	{
		this.eventDAO = new EventDAO();
	}
	

	public void insertEvent(Event event)
	{
		this.eventDAO.insert(event);
		
		
	}
	
	public EventDAO getDAO()
	{
		return this.eventDAO;
	}
	
}
