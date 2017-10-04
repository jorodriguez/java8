/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccer;

/**
 *
 * @author ihsa
 */
public class League {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Player player1 = new Player();
        player1.playerGame = "George Eliot";
        
        Player player2 = new Player();
        player2.playerGame = "Graham Greene";
        
        Player player3 = new Player();
        player3.playerGame = "Geoffrey Caucer"; 
        
        Player thePlayers[] = new Player[]{player1,player2,player3};
        //Player[] thePlayers = {player1,player2,player3};
        //Player thePlayers[] = {player1,player2,player3};
        
        
        Team team1 = new Team();
        team1.teamName = "The Greens";
        
        //Steo 10
       // player1.playerGame = "Robert Service";
        
        team1.playerArray = thePlayers;
        
        //step 11
        Team team2 = new Team();
        team2.teamName = "The Reds";
        team2.playerArray = new Player[3];
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerGame = "Robert Service";
        
        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerGame = "Robbie Burns";
        
        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerGame = "Rafael sanatini";
             
        
//        for(Player thePlayer : team1.playerArray){
//            System.out.println(thePlayer.playerGame);            
//        }
//        
//        for(Player thePlayer : team2.playerArray){
//            System.out.println(thePlayer.playerGame);            
//        }

        Game currGame = new Game();
        currGame.homeTeam = team1;       
        currGame.awayTeam = team2;
        
        Goal gol = new Goal();
        gol.thePlayer = currGame.homeTeam.playerArray[2];
        gol.theTeam = currGame.homeTeam;
        gol.theTime = 55;
        
        Goal[] theGoals = {gol};
        //currGame.goals = new Goal[]{gol};
        currGame.goals = theGoals;
        
        for(Goal currGol : currGame.goals){
        System.out.println("Gol en el minuto "+
                currGol.theTime+" por "+
                currGol.thePlayer.playerGame+" del equipo "+
                currGol.theTeam.teamName
                );
        }
        
    }
    
}
