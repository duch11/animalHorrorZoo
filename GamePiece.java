public class GamePiece {
 private int x;
    private int y;
    //private String fightMessage;
    //private String locationMessage;
    private String name;

    //public GamePiece(int x, int y, String fightMessage, String locationMessage, String name) {
    //    this.x = x;
    //    this.y = y;
    //    this.fightMessage = fightMessage;
    //    this.locationMessage = locationMessage;
    //    this.name = name;
    //}

    public GamePiece(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public void move(int newX, int newY) {
        // move right
        if (newX == 1 && newY == 0) {
            x++;
        }
        // move left
        else if (newX == -1 && newY == 0) {
            x--;
        }
        // move up
        else if (newX == 0 && newY == 1) {
            y++;
        }
        // move down
        else if (newX == 0 && newY == -1) {
            y--;
        }  
        else {
            System.out.println("Invalid input! Restart the game");
        }
    }
    // public void writeMessage(String newFightMessage, String newLocationMessage) {
    //    System.out.println(fightMessage);
    //    System.out.println(locationMessage);
    //}
    
    public String getName() {
        return this.name;
    }

    public int getPosX() {
       return this.x;
    }

    public int getPosY() {
        return this.y;
    }
   
}
