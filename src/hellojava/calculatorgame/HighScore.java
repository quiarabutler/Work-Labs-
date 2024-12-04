package hellojava.calculatorgame;
// Adding Player into the param of highscore will connect player to the highscore
public record HighScore(Player player, int score) {
}
