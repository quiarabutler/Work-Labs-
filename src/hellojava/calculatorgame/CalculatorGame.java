package hellojava.calculatorgame;

public class CalculatorGame {
    public static void main(String[] args) {
        // 1
        Player player = new Player("Quiara", 25);
        System.out.println(player);
        // 2
        HighScore highScore = new HighScore(player, 100);
        System.out.println(highScore);


    }
}
