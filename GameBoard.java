public class GameBoard
{
   private boolean firstFight; 
   private GamePiece rabbitGB;
   private GamePiece snakeGB;

   public GameBoard(GamePiece rabbit, GamePiece snake)
   {
       this.rabbitGB = rabbit;
       this.snakeGB = snake;
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
      if (snakeGB.getPosX() == rabbitGB.getPosX() + 1 
      || snakeGB.getPosX() == rabbitGB.getPosX() - 1
      || snakeGB.getPosY() == rabbitGB.getPosY() + 1
      || snakeGB.getPosY() == rabbitGB.getPosY() - 1)
      {
         startFight();
      } 

   } 

   private void startFight()
   {

   }

   private boolean checkBorder()
   {
       if (rabbitGB.getPosX() + 1 > 10 ||  
           rabbitGB.getPosX() - 1 < 1  || 
           rabbitGB.getPosY() + 1 > 10 || 
           rabbitGB.getPosY() - 1 < 1  ||
           snakeGB.getPosX()  + 1 > 10 ||  
           snakeGB.getPosX()  - 1 < 1  || 
           snakeGB.getPosY() + 1  > 10 || 
           snakeGB.getPosY() - 1  < 1)
       {
           System.out.println("You have hit a wall.");
           return false;
       }
        return true;

   }
}

