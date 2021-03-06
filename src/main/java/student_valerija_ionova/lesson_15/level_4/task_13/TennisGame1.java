package student_valerija_ionova.lesson_15.level_4.task_13;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class TennisGame1 implements TennisGame {

    private int m_score1 = 0;
    private int m_score2 = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(player1Name))
            m_score1 += 1;
        else
            m_score2 += 1;
    }

    public String getScore() {
        String score = "";

        if (equalScore()) {
            score = calculateScoreInCaseOfEqualScore();
        }
        else if (someoneCanWin ()) {
            score = calculateScoreIfSomeoneCanWin();
        }
        else {
            score = calculateScoreInTheGame();
        }
        return score;
    }

    private boolean equalScore (){
        return m_score1 == m_score2;
    }

    private boolean someoneCanWin(){
        return (m_score1 >= 4 || m_score2 >= 4);
    }

    private String calculateScoreInCaseOfEqualScore(){
        String score;
        switch (m_score1) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            default:
                score = "Deuce";
                break;
        }
        return score;
    }

    private String calculateScoreIfSomeoneCanWin(){
        int minusResult = m_score1-m_score2;
        if (minusResult==1) return "Advantage player1";
        else if (minusResult ==-1) return "Advantage player2";
        else if (minusResult >= 2) return "Win for player1";
        else return "Win for player2";
    }

    private String calculateScoreInTheGame(){
        int tempScore;
        String score = "";
        for (int i=1; i<3; i++) {
            if (i==1) tempScore = m_score1;
            else {  score+="-";
                    tempScore = m_score2;}

            switch(tempScore) {
                case 0:
                    score+="Love";
                    break;
                case 1:
                    score+="Fifteen";
                    break;
                case 2:
                    score+="Thirty";
                    break;
                case 3:
                    score+="Forty";
                    break;
            }
        }
        return score;
    }

}
