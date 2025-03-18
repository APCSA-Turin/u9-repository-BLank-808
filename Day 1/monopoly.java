public class monopoly extends BoardGame{
    private int Bank;
    private int diceUsed;

    public monopoly(int totalCash, int dice, int players){
        super("Resourse Management", "Large", players);
        Bank=totalCash;
        diceUsed=dice;
    }

    public int getBank() {
        return Bank;
    }

    public int getDiceUsed(){
        return diceUsed;
    }

    public void Roll(){
        System.out.println("Rolled " + diceUsed + " die");
    }
}
