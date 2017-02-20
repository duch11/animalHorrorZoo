public class GamePiece {
    private int x;
    private int y;
    private String fightMessage;
    private String locationMessage;
    private String name;

    public GamePiece(int x, int y, String fightMessage, String locationMessage, String name) {
        this.x = x;
        this.y = y;
        this.fightMessage = fightMessage;
        this.locationMessage = locationMessage;
        this.name = name;
    }

    //public GamePiece(int x, int y, String name) {
    //    this.x = x;
    //    this.y = y;
    //    this.name = name;
    //}

    public void move(String direction) {
        // move right
        if (direction.equals("right") {
            x++;
        }
        // move left
        else if (direction.equals("left") {
            x--;
        }
        // move up
        else if (direction.equals("up")) {
            y++;
        }
        // move down
        else if (direction.equals("down")) {
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
