public class SoccerTeam {

    private int wins;
    private int ties;
    private int losses;

    public static int gamesPlayed = 0;
    public static int goalsScored = 0;

    public SoccerTeam() {
        this.wins = 0;
        this.losses = 0;
        this.ties = 0;
    }

    public void startTournament(){
        SoccerTeam.gamesPlayed = 0;
        SoccerTeam.goalsScored = 0;
    }

    public int getPoints(){
        return 3 * this.wins + this.ties;
    }

    public void reset(){
        this.wins = 0;
        this.ties = 0;
        this.losses = 0;
    }

    public int points(){
        return (wins * 3) + (ties * 1);
    }

    public static int getGamesPlayed() {
        return gamesPlayed;
    }

    public static int getGoalsScored() {
        return goalsScored;
    }

    
    public void played(SoccerTeam other, int myScore, int otherScore){
        gamesPlayed++;
        goalsScored += myScore + otherScore;
        if(myScore > otherScore){
            this.wins++;
            other.losses++;
        } else if(myScore < otherScore){
            this.losses++;
            other.wins++;
        } else {
            this.ties++;
            other.ties++;
        }
    }
        
    public static void main(String[] args) {
        // Tournament 1
        SoccerTeam team1 = new SoccerTeam();
        SoccerTeam team2 = new SoccerTeam();
        team1.played(team2, 3, 2);
        System.out.println("Team 1 points: " + team1.points());
        System.out.println("Team 2 points: " + team2.points());
        System.out.println("Games played: " + SoccerTeam.getGamesPlayed());
        System.out.println("Goals scored: " + SoccerTeam.getGoalsScored());
    }    
}
