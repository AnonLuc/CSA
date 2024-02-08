public class SoccerTeam {

    
    public void played(SoccerTeam other, int myScore, int otherScore){
        if (myScore > otherScore){
            this.won();
            other.lost();
        } else if (myScore < otherScore){
            this.lost();
            other.won();
        } else {
            this.tied();
            other.tied();
        }
    }
}
