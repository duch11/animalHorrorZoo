public class GameLaunch
{
    public static void main(String[] args)
    {
        GamePiece snake = new GamePiece(3, 10, "Haha I'm hungry.", "I'm standing on square ", "snake");
        snake.move("left");
        Fight newFight = new Fight();
        newFight.startFight(snake);
        
        //System.out.println("I'm standing on square " + snake.getPosX() + ", " + snake.getPosY());
        
        GamePiece rabbit = new GamePiece(4, 5, "I'm scared of the snake.", "I'm standing on square ", "rabbit");
        rabbit.move("up");
        
        //System.out.println("I'm standing on square " + rabbit.getPosX() + ", " + rabbit.getPosY());
        snake.writeMessage("fight");
    }
}