import java.net.SocketException;

public class VehicleRunner {
    public static void main(String[] args) {
        BoardGame demo= new BoardGame("Test", "huge", 20);
        monopoly game1 = new monopoly(100000, 2, 4);
        Sorry game2= new Sorry(4, 20, 2);

        System.out.println(demo.getGameType());
        System.out.println(game1.getGameType());
        System.out.println(game2.getGameType());

        System.out.println(demo.getMaxplayers());
        System.out.println(game1.getMaxplayers());
        System.out.println(game2.getMaxplayers());

        System.out.println(demo.getSize());
        System.out.println(game1.getSize());
        System.out.println(game2.getSize());

        System.out.println(game1.getDiceUsed());
        System.out.println(game2.getDeckSize());

        System.out.println(game1.getBank());
        System.out.println(game2.getPieces());

        game1.Roll();
        game2.Draw();

    }
}