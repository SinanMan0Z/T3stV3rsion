package com.soccer;

public class Team implements Comparable<Team>
{
	private String name;
	private int points;
	
	public Team(String name, int points)
	{
		
		this.name = name;
		this.points = points;
	}
	
	public String getName() {
		return name;
	}
		
	public int getPoints() {
		return points;
	}
	
	public void setPoints(int points) {
		this.points = points;
	}

	@Override
	public int compareTo(Team o) {
		return o.points - points;
	}
}
