package student_aleksandra_maksimovic.lesson_15.level_4;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
public class TennisGame1 implements TennisGame {

    private int m_score1 = 0;
    private int m_score2 = 0;

    @CodeReviewComment(teacher = "Unused field, remove it!")
    private String player1Name;

	@CodeReviewComment(teacher = "Unused field, remove it!")
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    @CodeReviewComment(teacher = "Compare two Strings using == ? Not good idea!"
			+ "Use String.equals() method instead!")
    public void wonPoint(String playerName) {
    	if (playerName == "player1")
            m_score1 += 1;
        else
            m_score2 += 1;
    }

    public String getScore() {
        String score = "";
        int tempScore=0;
        if (m_score1==m_score2) {
            score = scoreEquals();
        }
        else if (m_score1>=4 || m_score2>=4) {
            score = scoreMoreThen4();
        }
        else {
            score = scoreNotEquals(score);
        }
        return score;
    }

    private String scoreNotEquals(String score) {
        int tempScore;
        for (int i = 1; i<3; i++) {
            if (i==1) tempScore = m_score1;
            else { score+="-"; tempScore = m_score2;}
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

    private String scoreMoreThen4() {
        String score;
        int minusResult = m_score1-m_score2;
        if (minusResult==1) score ="Advantage player1";
        else if (minusResult ==-1) score ="Advantage player2";
        else if (minusResult>=2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }

    private String scoreEquals() {
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
}
