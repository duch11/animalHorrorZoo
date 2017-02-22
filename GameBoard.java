public class GameBoard
{
   private boolean firstFight; 

   public void move(GamePiece piece, String direction)
   {
        piece.setPos(1,2);
        System.out.println(piece.getPosX() + " " + piece.getPosY() );
        
        if (direction.equals("left"))
        {
           System.out.println("Moving left"); 
        }
        if (direction.equals("right"))
        {
           System.out.println("Moving right"); 
        }
        if (direction.equals("up"))
        {
           System.out.println("Moving up"); 
        }
        if (direction.equals("down"))
        {
           System.out.println("Moving down"); 
        }
        
   } 

   private void checkProx()
   {

   } 

   private void startFight()
   {

   }

   private void checkBorder()
   {

   }
}

