package be.wellens.koen.emptyproject.bowling;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Frame> frames = new ArrayList<>();
    private int nextFrame = 0;

    public Game() {
        for (int i = 0; i < 10; i++) {
            this.frames.add(new Frame());
        }
    }

    public void roll(int pin) {
        Frame frame = frames.get(nextFrame);
        frame.roll(pin);

        if (frame.isFinished()) {
            nextFrame++;
        }
    }

    public int score() {
        return frames
                .stream()
                .mapToInt(Frame::getValue)
                .sum();
    }

    private class Frame {

        private int throwOne = -1;
        private int throwTwo = -1;

        boolean isFinished() {
            return throwOne != -1 && throwTwo != -1;
        }

        public void roll(int pin) {
            if (throwOne == -1) {
                throwOne = pin;
            } else {
                throwTwo = pin;
            }
        }

        public int getValue() {
            return throwOne + throwTwo;
        }
    }
}
