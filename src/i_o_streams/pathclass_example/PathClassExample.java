package i_o_streams.pathclass_example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathClassExample {

    /**
     * The best way to move, copy, and delete files in Java is with the path class.
     * This offers the additional functionality which is not available in the file class.
     */

    private static final String FILE_PATH1 = "/My Development/Java Workspace/Advanced Java Programming/src/i_o_streams/" +
            "pathclass_example/Hello World.txt";

    private static final String FILE_PATH2 = "/My Development/Java Workspace/Advanced Java Programming/src/i_o_streams/" +
            "bufferedReader_example/example.txt";

    public static void main(String[] args) {

        Path path = Paths.get(FILE_PATH1);
        try {
            Files.deleteIfExists(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Path path2 = Paths.get(FILE_PATH2);
        System.out.println(path2.getParent());
        System.out.println(path2.getRoot());
        System.out.println(path2.getFileName());
    }

}
