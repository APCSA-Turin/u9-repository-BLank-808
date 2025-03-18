public class Sorry extends BoardGame{
    private int startingPieces;
    private int deckSize;

    public Sorry(int startingPieces, int deckSize, int players){
        super("Luck Based", "small", players);
        this.startingPieces=startingPieces;
        this.deckSize=deckSize;
    }

    public int getPieces() {
        return startingPieces;
    }

    public int getDeckSize(){
        return deckSize;
    }

    public void Draw(){
        System.out.println("You Drew a card");
    }
}
