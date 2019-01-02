package be.wellens.koen.emptyproject.problem22;

import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ProgramTest {

    private Program program = new Program();

    @Test
    public void sortsListAlphabetically() throws IOException {
        List<String> result = program.run();

        assertThat(result.get(0)).startsWith("A");
        assertThat(result.get(result.size() - 1)).startsWith("Z");
    }
}