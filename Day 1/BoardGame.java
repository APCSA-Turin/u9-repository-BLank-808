public class BoardGame {
    private String Size;
    private String GameType;
    private int maxplayers;

    public BoardGame(String type, String size, int maxplayers){
        Size=size;
        this.maxplayers=maxplayers;
        GameType=type;
    }

    public String getGameType() {
        return GameType;
    }

    public int getMaxplayers() {
        return maxplayers;
    }

    public String getSize() {
        return Size;
    }

    public void NextTurn(){
        System.out.println("Turn is over, next plater play");
    }
}
