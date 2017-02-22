public class GameBoard
{
   private boolean firstFight; 

   public void move(GamePiece piece, String direction)
   {
        piece.setPos(1,2);
        System.out.println("Hej fra move" + piece.getPosY() );
        
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

