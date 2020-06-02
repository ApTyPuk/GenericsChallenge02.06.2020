package com.Artur;

public class Main {

    public static void main(String[] args) {

        TennisTeam dinamoTennis = new TennisTeam("Tennis Club Riga");

        HockeyTeam dinamoRiga = new HockeyTeam("Dinamo Riga");
        HockeyTeam dinamoMoskva = new HockeyTeam("Dinamo Moskva");
        HockeyTeam gazprom = new HockeyTeam("HC Gazprom");
        HockeyTeam dinamoMinsk = new HockeyTeam("Dinamo Minsk");
        HockeyTeam akbars = new HockeyTeam("Akbars");
        HockeyTeam jockerit = new HockeyTeam("Jockerit");

        League<HockeyTeam> khl = new League<>("KHL"); // !!!!!!!!!! Here declaring Type Parameter - <HockeyTeam>

        khl.addTeam(dinamoTennis, 100);
        khl.addTeam(dinamoRiga, 50);
        khl.addTeam(dinamoMoskva, 100);
        khl.addTeam(gazprom, 90);
        khl.addTeam(dinamoMinsk, 55);
        khl.addTeam(akbars, 74);
        khl.addTeam(jockerit, 86);

        khl.printTeamsByRating();


    }
}
