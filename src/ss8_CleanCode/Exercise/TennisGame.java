package ss8_CleanCode.Exercise;

public class TennisGame {

    public static final int INT = 4;
    public static final int INT1 = 1;
    public static final int INT2 = 2;
    public static final int INT3 = 3;

    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        String score = "";
        int tempScore = 0;
        if (isaBoolean(scorePlayer1, scorePlayer2)) {
            switch (scorePlayer1) {
                case 0:
                    score = "Love-All";
                    break;
                case INT1:
                    score = "Fifteen-All";
                    break;
                case INT2:
                    score = "Thirty-All";
                    break;
                case INT3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else if (isaBoolean1(scorePlayer1, scorePlayer2)) {
            int minusResult = scorePlayer1 - scorePlayer2;
            if (isaBoolean(minusResult)) score = "Advantage player1";
            else if (isaBoolean1(minusResult)) score = "Advantage player2";
            else if (isaBoolean2(minusResult)) score = "Win for player1";
            else score = "Win for player2";
        } else {
            for (int i = INT1; i < INT3; i++) {
                if (isaBoolean(i)) tempScore = scorePlayer1;
                else {
                    score += "-";
                    tempScore = scorePlayer2;
                }
                switch (tempScore) {
                    case 0:
                        score += "Love";
                        break;
                    case INT1:
                        score += "Fifteen";
                        break;
                    case INT2:
                        score += "Thirty";
                        break;
                    case INT3:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }

    private static boolean isaBoolean2(int minusResult) {
        return minusResult >= INT2;
    }


    private static boolean isaBoolean1(int minusResult) {
        return minusResult == -INT1;
    }

    private static boolean isaBoolean(int minusResult) {
        return minusResult == INT1;
    }

    private static boolean isaBoolean1(int scorePlayer1, int scorePlayer2) {
        return scorePlayer1 >= INT || scorePlayer2 >= INT;
    }

    private static boolean isaBoolean(int scorePlayer1, int scorePlayer2) {
        return scorePlayer1 == scorePlayer2;
    }
}