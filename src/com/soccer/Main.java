package com.soccer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println("Bundesliga Tabelle");
		System.out.println("Position | Mannschaft | Punkte");

		List<Team> teams = new ArrayList<>();
		teams.add(new Team("ESV Nordenham", 24));
		teams.add(new Team("STV Wilhelmshaven 2", 10));
		teams.add(new Team("JSG Sande/Göddens", 20));
		teams.add(new Team("1.FC Nordenham", 18));
		teams.add(new Team("WSC Frisia WHV 2", 7));
		teams.add(new Team("FSV Jever 3", 9));
		teams.add(new Team("JSG Friesische Wehde 2", 21));
		teams.add(new Team("JSG Neuenburg/Astederfelde", 10));
		teams.add(new Team("ESV Wilhelsmhaven 2", 1));
		teams.add(new Team("JSG Wangerland", 7));

		try (Scanner reader = new Scanner(System.in)) { // Reading from System.in

			while (true) {
				char choice = reader.nextLine().charAt(0);
  
				if (choice == 'q')
					break;

				if (choice == 'p') {
					Collections.sort(teams);

					int i = 1;
					for (Team team : teams) {
						String name = team.getName();
						int points = team.getPoints();
						int position = i = i++;
						System.out.println(position + "|" + name + "|" + points);
						i = i + 1; // i++;
					}
				} else if (choice == 'a') {
					System.err.println("Bitte Name eingeben:");
					String name = reader.nextLine();
					System.err.println("Bitte Punkte eingeben:");
					String points = reader.nextLine();
					int punkte = Integer.parseInt(points);
					teams.add(new Team(name, punkte));
				}

				if (choice == 'e') {
					System.err.println("Bitte Position eingeben:");
					String position = reader.nextLine();
					System.err.println("Bitte hinzuzufügene Punkte eingeben:");
					String points = reader.nextLine();
					int punkte = Integer.parseInt(points);
					int place = Integer.parseInt(position);
					Team team = teams.get(place - 1);
					team.setPoints(team.getPoints() + punkte);
				}
			}
		}
	}
}
