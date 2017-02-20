public class Fight
{
    private boolean firstRoll = true;

    public void startFight(GamePiece snake)
    {
        System.out.println(snake.getFightMessage());
        rollDice();
    }

    private void rollDice()
    {

    }
}