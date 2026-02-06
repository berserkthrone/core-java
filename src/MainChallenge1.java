public class MainChallenge1 {

    public static void main(String[] args) {


        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("The highScore is " + highScore);

        System.out.println("The next highScore is " +
        calculateScore(true,10000, 8, 200));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);

        }

        return finalScore;
    }
}
