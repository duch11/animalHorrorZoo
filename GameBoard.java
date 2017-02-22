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
        piece.setPos(1,2);
        System.out.println("Hej fra move" + piece.getPosY() );
        checkProx();
        
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

