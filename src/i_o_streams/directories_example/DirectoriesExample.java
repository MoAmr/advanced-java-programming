package i_o_streams.directories_example;

import java.io.File;
import java.io.FilenameFilter;

public class DirectoriesExample {

    public static void main(String[] args) {

        /** I can also filter the results so that it only shows certain file types.
         *  To do this, I can use a simple interface called FilenameFilter.
         *  This is a functional interface with only one method, so I can use a lambda to implement it. */

        FilenameFilter filter = (file, fileName) -> {
            return fileName.contains(".");
        };

        String[] contents = new File(".").list(filter);
        for (String file: contents) {
            System.out.println(file);
        }

        new File("myDirectory").mkdir();
    }
}
