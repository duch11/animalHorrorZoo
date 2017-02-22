public class GameBoard
{
   private boolean firstFight; 
   private GamePiece rabbitGb;
   private GamePiece snakeGb;

   public GameBoard(GamePiece rabbit, GamePiece snake)
   {
       this.rabbitGb = rabbit;
       this.snakeGb = snake;
   }

   public void move(GamePiece piece, String direction)
   {
        
        System.out.println(piece.getPosX() + " " + piece.getPosY() );
        
        if (direction.equals("left"))
        {
           piece.setPos(piece.getPosX() - 1, piece.getPosY()); 
           System.out.println("Moving left");
           piece.writeMessage("location"); 
        }
        if (direction.equals("right"))
        {
           piece.setPos(piece.getPosX() + 1, piece.getPosY()); 
           System.out.println("Moving right");
           piece.writeMessage("location"); 
        }
        if (direction.equals("up"))
        {
           piece.setPos(piece.getPosX(), piece.getPosY() + 1); 
           System.out.println("Moving up");
           piece.writeMessage("location"); 
        }
        if (direction.equals("down"))
        {
           piece.setPos(piece.getPosX(), piece.getPosY() - 1); 
           System.out.println("Moving down");
           piece.writeMessage("location"); 
        }
   } 

   private void checkProx()
   {
        System.out.println("Her er slangen: " + snakeGb.getPosX() + " " + snakeGb.getPosY() );
        System.out.println("Her er rabbit: " + rabbitGb.getPosX() + " " + rabbitGb.getPosY() );
   } 

   private void startFight()
   {

   }

   private void checkBorder()
   {

   }
}

