package bll;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JOptionPane;

import dao.FighterDAO;
import objects.CovidTest;
import objects.Fighter;

public class FighterBLL
{
	public FighterDAO fighterDAO;
	public Date tournamentStartDate;
	
	public FighterBLL()
	{
		this.fighterDAO = new FighterDAO();
	}
	
	
	
	
	public void insertFighter(Fighter fighter)
	{	
		List<Fighter> fightersList = this.fighterDAO.report();
		boolean alreadyRegistered = false;
		
		
		for(Fighter f : fightersList)
		{
			if(f.getFirstName().equals(fighter.getFirstName()) &&
			   f.getLastName().equals(fighter.getLastName()))
			{
				alreadyRegistered = true;
				
				JOptionPane.showMessageDialog(null, "Fighter wasn't inserted. Fighter "
								  + fighter.getFirstName() + " " + fighter.getLastName()
								  + " is already registered");
			}
		}
		if(alreadyRegistered == false)
		{
			this.fighterDAO.insert(fighter);
			JOptionPane.showMessageDialog(null, "You have succesfully registered");
			
			
		}
		
	}
	
	public FighterDAO getDAO()
	{
		return this.fighterDAO;
	}
}
