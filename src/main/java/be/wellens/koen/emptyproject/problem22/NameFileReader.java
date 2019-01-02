package be.wellens.koen.emptyproject.problem22;

import org.apache.commons.lang.StringUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameFileReader {

    private static final String FILE_PATH = "/Users/koenwellens/Projects/empty-project/src/main/resources/p022_names.txt";
    private static final String SEPARATOR_CHARACTER = ",";

    public List<String> getContentFromNameFile() throws IOException {
        return Files.lines(Paths.get(FILE_PATH))
                .flatMap(line -> Arrays.stream(StringUtils.split(line, SEPARATOR_CHARACTER)))
                .map(nameWithQuotes -> nameWithQuotes.substring(1, nameWithQuotes.length() - 1))
                .collect(Collectors.toList());
    }
}
