package be.wellens.koen.emptyproject.problem22;

import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class NameFileReaderTest {

    private NameFileReader nameFileReader = new NameFileReader();

    @Test
    public void retrievesAllNamesFromFile() throws IOException {
        List<String> content = nameFileReader.getContentFromNameFile();

        assertThat(content).hasSize(5163);
    }

    @Test
    public void removesQuotesFromNames() throws IOException {
        List<String> content = nameFileReader.getContentFromNameFile();

        assertThat(content.get(0)).isEqualTo("MARY");
        assertThat(content.get(1)).isEqualTo("PATRICIA");
    }
}