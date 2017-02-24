public class GamePiece {
    private int x;
    private int y;
    private String fightMessage;
    private String locationMessage;

    public GamePiece(int x, int y, String fightMessage, String locationMessage) {
        this.x = x;
        this.y = y;
        this.fightMessage = fightMessage;
        this.locationMessage = locationMessage;
    }

    public void writeMessage(String message) {
        if (message.equals("fight")) {
        System.out.println(fightMessage);
        }
        else if (message.equals("location")) {
        System.out.println(this.locationMessage + " " + getPosX() + ", " + getPosY());
        }
    }
    
    public int getPosX() {
       return this.x;
    }

    public int getPosY() {
        return this.y;
    }

    public void setPos(int x, int y) {
        this.x = x;
        this.y = y;
    }
}