public class GameLaunch
{
    public static void main(String[] args)
    {
        GamePiece snake = new GamePiece(3, 10, "Haha I'm hungry.", "I'm the evil snake, I'm standing on square", "snake");
        GamePiece rabbit = new GamePiece(1, 3, "Oh no don't eat me!!'", "I'm the rabbit, I'm standing on square", "rabbit");
        GameBoard board = new GameBoard(rabbit, snake);
        GfxTest gfx = new GfxTest();
        gfx.writeBoard(snake.getPosX(), snake.getPosY(), rabbit.getPosX(), rabbit.getPosY());
        board.move(snake, "down");
        gfx.writeBoard(snake.getPosX(), snake.getPosY(), rabbit.getPosX(), rabbit.getPosY());
        board.move(rabbit, "right");
        gfx.writeBoard(snake.getPosX(), snake.getPosY(), rabbit.getPosX(), rabbit.getPosY());
        board.move(snake, "down");
        gfx.writeBoard(snake.getPosX(), snake.getPosY(), rabbit.getPosX(), rabbit.getPosY());
        board.move(rabbit, "right");
        gfx.writeBoard(snake.getPosX(), snake.getPosY(), rabbit.getPosX(), rabbit.getPosY());
        board.move(snake, "down");
        gfx.writeBoard(snake.getPosX(), snake.getPosY(), rabbit.getPosX(), rabbit.getPosY());
        board.move(rabbit, "right");
        gfx.writeBoard(snake.getPosX(), snake.getPosY(), rabbit.getPosX(), rabbit.getPosY());
        board.move(snake, "down");
        gfx.writeBoard(snake.getPosX(), snake.getPosY(), rabbit.getPosX(), rabbit.getPosY());
        board.move(rabbit, "right");
        gfx.writeBoard(snake.getPosX(), snake.getPosY(), rabbit.getPosX(), rabbit.getPosY());
        board.move(snake, "down");
        gfx.writeBoard(snake.getPosX(), snake.getPosY(), rabbit.getPosX(), rabbit.getPosY());
        board.move(rabbit, "right");                
        gfx.writeBoard(snake.getPosX(), snake.getPosY(), rabbit.getPosX(), rabbit.getPosY());
                    

        // System.out.println("You have won the game... Congratulations!");
    }
}

/* TEST KODE ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        snake.move("left");
        Fight newFight = new Fight();
        newFight.startFight(snake);
        //System.out.println("I'm standing on square " + snake.getPosX() + ", " + snake.getPosY());
        
        GamePiece rabbit = new GamePiece(4, 5, "I'm scared of the snake.", "I'm the nice rabbit, I'm standing on square", "rabbit");
        rabbit.move("up");
        
        //System.out.println("I'm standing on square " + rabbit.getPosX() + ", " + rabbit.getPosY());
        snake.writeMessage("fight");
        snake.writeMessage("location");

        // GRAFIK KODE TEST ////////////////////////////////////////////////////////////////////// 
        // 
        // GfxTest gfx = new GfxTest();
        // gfx.writeBoard(snake.getPosX(), snake.getPosY(), rabbit.getPosX(), rabbit.getPosY());
        // 
        //////////////////////////////////////////////////////////////////////////////////////////


*/