package HW2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Saul");
        Human human2 = new Human("Max");
        Human human3 = new Human("Peter");
        Human human4 = new Human("Diter");
        Market market = new Market();
        market.takeInQueue(human1);
        market.takeInQueue(human2);
        market.takeInQueue(human3);
        market.takeInQueue(human4);
        market.update();
    }
}
