package designpattern.strategy;

public class StrategyTest {
    public static void run() {
        int seed1 = 312;
        int seed2 = 60;

        Player player1 = new Player("CHOI", new WinningStrategy(seed1));
        Player player2 = new Player("KIM", new ProbStrategy(seed2));
        for (int i = 0; i < 10000; i++) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();
            if (nextHand1.isStrongThan(nextHand2)) {
                System.out.println("Winner:" + player1);
                player1.win();
                player2.lose();
            } else if (nextHand2.isStrongThan(nextHand1)) {
                System.out.println("Winner:" + player2);
                player1.lose();
                player2.win();
            } else {
                System.out.println("Even....");
                player1.even();
                player2.even();
            }
        }
        System.out.println("Total result: ");
        System.out.println(player1);
        System.out.println(player2);
    }
}
