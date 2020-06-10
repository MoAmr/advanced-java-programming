package i_o_streams.tryWithResources_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class TryWithResourcesExample {


    /**
     * When using input and output resources, it is important to use try with resources whenever you can.
     * Using try with resources makes sure that all resources are closed for me. I don't have to worry about manually
     * closing all resources which can be difficult. If resources aren't closed properly, it is easy to end up with
     * code-leaking resources. This is especially true if you are using multiple resources that interact with each other.
     */

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new StringReader("Hello world"));
             StringWriter writer = new StringWriter();) {
            writer.write(reader.readLine());
            System.out.println(writer.toString());
        } catch (IOException ioe) {

        }
    }
}
