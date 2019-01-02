package be.wellens.koen.emptyproject.problem22;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class Program {

    public List<String> run() throws IOException {
        NameFileReader nameFileReader = new NameFileReader();

        List<String> content = nameFileReader.getContentFromNameFile();
        Collections.sort(content);

        return content;
    }
}
