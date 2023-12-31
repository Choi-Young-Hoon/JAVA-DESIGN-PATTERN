package designpattern.strategy;

public enum Hand {
    // 가위바위보를 나타내는 세 개의 enum 상수
    ROCK("바위", 0),
    SCISSORS("가위", 1),
    PAPER("보", 2);

    // enum이 가진 필드
    private String name; // 가위 바위 보의 이름
    private int handValue; // 가위 바위 보의 값

    // 손의 값 상수를 얻기위한 배열
    private static Hand[] hands = {
            ROCK, SCISSORS, PAPER
    };

    // 생성자
    private Hand(String name, int handValue) {
        this.name = name;
        this.handValue = handValue;
    }

    // 손의 값으로 enum 값을 가져온다.
    public static Hand getHand(int handValue) {
        return hands[handValue];
    }

    // this가 h보다 강할 때 true
    public boolean isStrongThan(Hand h) {
        return fight(h) == 1;
    }

    // this가 h보다 약할 때 true
    public boolean isWeakerThan(Hand h) {
        return fight(h) == -1;
    }

    private int fight(Hand h) {
        if (this == h) {
            return 0;
        } else if ((this.handValue + 1) % 3 == h.handValue) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return this.name;
    }
}
