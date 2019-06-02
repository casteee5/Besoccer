/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import jfdata.manager.JfdataManager;
import jfdata.model.competition.Competition;
import jfdata.model.competition.CompetitionList;
import jfdata.model.match.MatchList;
import jfdata.model.standing.Standing;
import jfdata.model.team.TeamList;
import ventanas.Ventana;

/**
 *
 * @author 1DAM
 */
public class Main {
    
    public static void main(String[] args){
    
    	Ventana ventana=new Ventana();
    /*JfdataManager jfdataManager = new JfdataManager("ae87af9163864e60a8b5ac1ed791fca4");
    
    CompetitionList actual = jfdataManager.getAllCompetitions();
    
    TeamList actualTeam = jfdataManager.getTeamsByCompetition(2021);
    
    int i=0;
    Competition actualCompetition;
    
    do{    
        actualCompetition = actual.getCompetitions().get(i);
        i++;
    }while(!actualCompetition.getId().equals("2021")&&i<actual.getCompetitions().size());
    
        //System.out.println(actualCompetition.toString());
        
        Standing actualPLStanding = jfdataManager.getStanding(2021);
        
        System.out.println("Premier League");
        
        for (int j = 0; j < actualPLStanding.getStandings().get(0).getTable().size(); j++) {
            System.out.println(j+1+".- "+actualPLStanding.getStandings().get(0).getTable().get(j).getTeam().getName());
        }
        
        MatchList actualMatchPL = jfdataManager.getMatchesByCompetition(2021);
        System.out.println("");
        
        for(int m=0;m<actualMatchPL.getMatches().size();m++){
            if(actualMatchPL.getMatches().get(m).getHomeTeam().getName().equals("Arsenal FC")||actualMatchPL.getMatches().get(m).getAwayTeam().getName().equals("Arsenal FC")){
                System.out.println(actualMatchPL.getMatches().get(m).getMatchday()+" "+actualMatchPL.getMatches().get(m).getHomeTeam().getName()+" "+actualMatchPL.getMatches().get(m).getScore().getFullTime().getHomeTeam()+" - "+actualMatchPL.getMatches().get(m).getScore().getFullTime().getAwayTeam()+" "+actualMatchPL.getMatches().get(m).getAwayTeam().getName());
            }
        }
        
        Standing actualLFStanding = jfdataManager.getStanding(2014);
        
        System.out.println("\nLa Liga");
        
        for (int j = 0; j < actualLFStanding.getStandings().get(0).getTable().size(); j++) {
            System.out.println(j+1+".- "+actualLFStanding.getStandings().get(0).getTable().get(j).getTeam().getName());
        }

        MatchList actualMatchLFS = jfdataManager.getMatchesByCompetition(2014);
        
        for(int m=0;m<actualMatchLFS.getMatches().size();m++){
            System.out.println(actualMatchLFS.getMatches().get(m).getHomeTeam().getName()+" - "+actualMatchLFS.getMatches().get(m).getAwayTeam().getName());
        }

    //List<Team> ST=actualTeam.getTeams();
        
    
    
        /*for(int j=0;j<ST.size();j++){
            System.out.println(ST.get(j).getName());
        }*/
        
    
    }  
}
