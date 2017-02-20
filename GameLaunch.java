public class GameLaunch
{
    public static void main(String[] args)
    {
        GamePiece snake = new GamePiece(3, 10, "Haha I'm hungry.", "I'm standing on square", "snake");
        snake.move("left");
        Fight newFight = new Fight();
        newFight.startFight(snake);
        
    }
}