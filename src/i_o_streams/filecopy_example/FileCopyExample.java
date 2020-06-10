package i_o_streams.filecopy_example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class FileCopyExample {


    private static final String SOURCE_PATH = "/My Development/Java Workspace/Advanced Java Programming/src/i_o_streams/" +
            "filecopy_example/example.txt";

    private static final String DEST_PATH = "/My Development/Java Workspace/Advanced Java Programming/src/i_o_streams/" +
            "filecopy_example/newExample.txt";

    public static void main(String[] args) {

        Path source = Paths.get(SOURCE_PATH);
        Path dest = Paths.get(DEST_PATH);

        try {
            Files.copy(source, dest, REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
