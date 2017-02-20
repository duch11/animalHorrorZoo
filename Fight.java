public class Fight
{
    private boolean firstRoll = true;

    public void startFight(GamePiece snake)
    {
        System.out.println(snake.writeMessage("fight"));
        rollDice();
    }

    private void rollDice()
    {

    }
}