package com.sanketkumbhare.soccerapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LiveScore {
    @SerializedName("Date")
    @Expose
    private String date;
    @SerializedName("League")
    @Expose
    private String league;
    @SerializedName("Round")
    @Expose
    private String round;
    @SerializedName("HomeTeam")
    @Expose
    private String homeTeam;
    @SerializedName("HomeTeam_Id")
    @Expose
    private String homeTeamId;
    @SerializedName("AwayTeam")
    @Expose
    private String awayTeam;
    @SerializedName("AwayTeam_Id")
    @Expose
    private String awayTeamId;
    @SerializedName("Time")
    @Expose
    private String time;
    @SerializedName("HomeGoals")
    @Expose
    private String homeGoals;
    @SerializedName("AwayGoals")
    @Expose
    private String awayGoals;
    @SerializedName("Location")
    @Expose
    private String location;

    public LiveScore(String date, String league, String round, String homeTeam, String homeTeamId, String awayTeam, String awayTeamId, String time, String homeGoals, String awayGoals, String location) {
        this.date = date;
        this.league = league;
        this.round = round;
        this.homeTeam = homeTeam;
        this.homeTeamId = homeTeamId;
        this.awayTeam = awayTeam;
        this.awayTeamId = awayTeamId;
        this.time = time;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getHomeTeamId() {
        return homeTeamId;
    }

    public void setHomeTeamId(String homeTeamId) {
        this.homeTeamId = homeTeamId;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public String getAwayTeamId() {
        return awayTeamId;
    }

    public void setAwayTeamId(String awayTeamId) {
        this.awayTeamId = awayTeamId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getHomeGoals() {
        return homeGoals;
    }

    public void setHomeGoals(String homeGoals) {
        this.homeGoals = homeGoals;
    }

    public String getAwayGoals() {
        return awayGoals;
    }

    public void setAwayGoals(String awayGoals) {
        this.awayGoals = awayGoals;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
