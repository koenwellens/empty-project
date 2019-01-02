package be.wellens.koen.emptyproject.bowling;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {

    private Game game = new Game();

    @Test
    public void testCaseForNoSparesAndNoStrikes() {
        for (int i = 0; i < 10; i++) {
            rollFrame(9, 0);
        }

        assertThat(game.score()).isEqualTo(90);
    }

    @Test
    public void testCaseWithOneSpare() {
        rollFrame(9, 1);
        for (int i = 0; i < 9; i++) {
            rollFrame(9, 0);
        }

        assertThat(game.score()).isEqualTo(100);
    }

    private void rollFrame(int throwOne, int throwTwo) {
        game.roll(throwOne);
        game.roll(throwTwo);
    }
}