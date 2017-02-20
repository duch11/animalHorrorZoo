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
        if (direction.equals("right")) {
            x++;
            System.out.println("You moved right!");
        }
        // move left
        else if (direction.equals("left")) {
            x--;
            System.out.println("You moved left!");
        }
        // move up
        else if (direction.equals("up")) {
            y++;
            System.out.println("You moved up!");
        }
        // move down
        else if (direction.equals("down")) {
            y--;
            System.out.println("You moved down!");
        }  
        else {
            System.out.println("Invalid input! Restart the game");
        }
    }
    public void writeMessage(String message) {
        if (message.equals("fight")) {
        System.out.println(fightMessage);
        }
        else if (message.equals("location")) {
        System.out.println(locationMessage);
        }
    }
    
    public String getName() {
        return this.name;
    }

    public int getPosX() {
       return this.x;
    }

    public int getPosY() {
        return this.y;
    }

    public String getFightMessage() {
        return this.fightMessage;
    }

    public String getLocationMessage() {
        return this.locationMessage;
    }
   
}
