public class MethodOverloading {
    public static void main(String[] args) {

        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);

        calculateScore(50);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " score " + score + " points");
        return score * 1000;
    }
    public static int calculateScore( int score) {
        System.out.println("Unnamed Player Scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore() {
        System.out.println("No Player name , no player score");
        return 0;
    }
}{
}
