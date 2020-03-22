package com.capgemini.onlinemoviebookingsystem.util;
import java.time.*;
import java.util.*;

import com.capgemini.onlinebookingsystem.dto.Show;
public class ShowRepoistory {
	
	public static List<Show> showlist =new ArrayList<Show>();
	
	public ShowRepoistory()
	{
		showlist.add(new Show(201,LocalTime.of(1,30,00),LocalTime.of(2,45,00),3001,"A",2001));
		showlist.add(new Show(202,LocalTime.of(3,30,00),LocalTime.of(5,45,00),3001,"B",2001));
		showlist.add(new Show(203,LocalTime.of(2,30,00),LocalTime.of(4,45,00),3002,"C",2002));
		showlist.add(new Show(204,LocalTime.of(10,30,00),LocalTime.of(12,45,00),3003,"A",2002));
		showlist.add(new Show(205,LocalTime.of(10,30,00),LocalTime.of(12,45,00),3003,"C",2003));
		showlist.add(new Show(206,LocalTime.of(3,30,00),LocalTime.of(5,30,00),3004,"B",2003));
	



		
	}
	
	
	

}
