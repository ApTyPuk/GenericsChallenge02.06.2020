package com.Artur;

import java.util.ArrayList;
import java.util.Collections;

public class League<LeagueType extends Team> {
//    private String name = "KHL Hockey League";
    private String name;

    private ArrayList<LeagueType> leagueTable = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(LeagueType team, int score){
//        Team team = new Team(name);       //why I can't do so?
        if(leagueTable.contains(team)){
            System.out.println("Such team already exists.");
            return false;
        }else {
            System.out.println(team.getName() + " added to KHL team list.");
            addScoreToTeamRating(team, score);
            leagueTable.add(team);
            return true;
        }
    }

    public void addScoreToTeamRating(LeagueType team, int score){
        team.setRatingScore(score);
    }

    public void printTeamsByRating(){
        Collections.sort(leagueTable);
        for(Team team : leagueTable)
        System.out.println(team.getName() + " -> " + team.getRating());
    }

}
