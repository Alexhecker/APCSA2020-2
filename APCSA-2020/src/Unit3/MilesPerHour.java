package Unit3;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double totalHours;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		setNums(dist, hrs, mins);
		mph = 0.0;
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		totalHours = (double)minutes/60 + (double)hours;
		mph = (double)(distance/totalHours);
		mph = Math.round(mph);
	}

	public void print()
	{
		System.out.println(distance + " miles in " + hours + " hour " + minutes + " minutes = " + mph + " MPH.\n");
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "I drove " + distance + " miles in " + hours + " hours and " + minutes + " minutes, so I went " + mph + " MPH.";
	}
}