package i_o_streams.bufferedReader_example;

import java.io.*;

public class BufferedReaderExample {

    private static final String FILE_PATH = "/My Development/Java Workspace/Advanced Java Programming/src/" +
            "i_o_streams/bufferedReader_example/example.txt";

    public static void main(String[] args) {

        File myFile = new File(FILE_PATH);
        try {

            /** Buffered reader just returns a continuous stream. An advantage of buffered reader is that it
             *  is synchronized, which means it can safely be used in a multi-threaded application. It is also
             *  faster than a scanner. So if you're reading in long sections of text, it is often the better option.*/

            BufferedReader reader = new BufferedReader(new FileReader(myFile));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
