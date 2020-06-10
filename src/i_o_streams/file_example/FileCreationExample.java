package i_o_streams.file_example;

import java.io.File;
import java.io.IOException;

public class FileCreationExample {

    private static final String FILE_PATH = "/My Development/Java Workspace/Advanced Java Programming/src/" +
            "i_o_streams/file_example/myFile.txt";

    public static void main(String[] args) {

        File myFile = new File(FILE_PATH);
        try {
            boolean fileCreated = myFile.createNewFile();
            System.out.println("file created: " + fileCreated);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
