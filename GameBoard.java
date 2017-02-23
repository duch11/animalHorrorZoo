public class GameBoard
{
   private boolean firstFight = true; 
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
        
        if (direction.equals("left") && checkBorder(piece, direction))
        {
           piece.setPos(piece.getPosX() - 1, piece.getPosY()); 
           System.out.println("Moving left");
           piece.writeMessage("location"); 
        }
        if (direction.equals("right") && checkBorder(piece, direction))
        {
           piece.setPos(piece.getPosX() + 1, piece.getPosY()); 
           System.out.println("Moving right");
           piece.writeMessage("location"); 
        }
        if (direction.equals("up") && checkBorder(piece, direction))
        {
           piece.setPos(piece.getPosX(), piece.getPosY() + 1); 
           System.out.println("Moving up");
           piece.writeMessage("location"); 
        }
        if (direction.equals("down") && checkBorder(piece, direction))
        {
           piece.setPos(piece.getPosX(), piece.getPosY() - 1); 
           System.out.println("Moving down");
           piece.writeMessage("location"); 
        }
        checkProx();
   } 

   private boolean checkProx()
   {
      if (snakeGB.getPosX() == rabbitGB.getPosX() + 1 && snakeGB.getPosY() == rabbitGB.getPosY() 
      || snakeGB.getPosX() == rabbitGB.getPosX() - 1 && snakeGB.getPosY() == rabbitGB.getPosY()
      || snakeGB.getPosY() == rabbitGB.getPosY() + 1 && snakeGB.getPosX() == rabbitGB.getPosX()
      || snakeGB.getPosY() == rabbitGB.getPosY() - 1 && snakeGB.getPosX() == rabbitGB.getPosX())
      {
         return startFight();
      }
      return true; 

   } 

   private boolean startFight()
   {
    if (firstFight == true) {
    firstFight = false;
    System.out.println("The snake initiates a fight with the rabbit, but the rabbit escapes!");
    return true;
    }
    System.out.println("The snake eats the rabbit!");
    return false; 
   }

   private boolean checkBorder(GamePiece piece, String direction)
   {
       if (direction.equals("right") && piece.getPosX() + 1 > 10 ||  
           direction.equals("left") && piece.getPosX() - 1 < 1  || 
           direction.equals("up") && piece.getPosY() + 1 > 10 || 
           direction.equals("down") && piece.getPosY() - 1 < 1)
       {
           System.out.println("You have hit a wall.");
           return false;
       }
        return true;

   }
}

