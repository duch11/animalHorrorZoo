public class Fight
{
    private boolean firstRoll = true;

    public void startFight(GamePiece snake)
    {
        snake.writeMessage("fight");
        rollDice();
    }

    private void rollDice()
    {
        
    }
    
}