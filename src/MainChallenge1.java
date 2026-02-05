public class MainChallenge1 {

    public static void main(String[] args) {


        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finaLScore = score;

        calculateScore(gameOver = true, );


        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finaLScore = score;

        if (gameOver) {
            finaLScore += (levelCompleted * bonus);
            System.out.println("Your final boss " + finaLScore);
        }

    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finaLScore = score;

        if (gameOver) {
            finaLScore += (levelCompleted * bonus);
            System.out.println("Your final boss " + finaLScore);
        }
    }
}
