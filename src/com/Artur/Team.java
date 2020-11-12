package com.Artur;

public abstract class Team implements Comparable<Team> {
    private String name;
    private int ratingScore = 0;
//    private int gamePlayed = 0;
//    private int gameLost = 0;
//    private int gameWon = 0;
//    private int gameTie = 0;


    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return ratingScore;
    }

    public void setRatingScore(int ratingScore) {
        this.ratingScore = ratingScore;
    }

    @Override
    public int compareTo(Team team) {
//        return Integer.compare(team.getRatingScore(), this.ratingScore);
        if(this.ratingScore > team.getRating()) {
            return -1;
        }else if( this.ratingScore < team.getRating()){
            return 1;
        }else{
            return 0;
        }
    }


}
