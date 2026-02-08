package basics;

public class KeywordsAndExpressions {

    public static void main(String[] args) {

    int highscore = 50;

    if (highscore > 25){
        highscore = highscore + 1000;
    }

    int health = 100;

    if ((health < 25) && (highscore > 1000)) {
        highscore = highscore - 1000;
    }

    //how many expressions are the in the above part
    // ANSWER is 12
    }
}
