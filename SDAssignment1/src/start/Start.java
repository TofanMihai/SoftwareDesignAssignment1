package start;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import bll.FighterBLL;
import dao.AbstractDAO;
import objects.CovidTest;
import objects.Event;
import bll.CovidTestBLL;
import bll.EventBuilder;
import objects.Fighter;
import presentation.Administrator;
import presentation.FighterForm;
import presentation.Forum;
import presentation.MainPanel;

public class Start extends AbstractDAO<CovidTest>
{
	

	
	
	public static void main(String[] args)
	{

		Forum forum = new Forum();
		Administrator administrator = new Administrator();
		FighterForm fighterForm = new FighterForm();
		MainPanel mp = new MainPanel();
		
		administrator.registerObserver(forum);		
		fighterForm.setAdministrator(administrator);
		mp.setAdministrator(administrator);
		mp.setFighterForm(fighterForm);
		mp.setForum(forum);

		mp.setVisible(true);

	}
}
