import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * Created by loopasam on 5/21/16.
 */
public class PostAnalysis {

    public static void main(String[] args) throws IOException {

        //Read the result and find the size largest word

        Path filePath = new File("/home/loopasam/IdeaProjects/inchikey-scrabble/src/main/resources/results.txt").toPath();
        Charset charset = Charset.defaultCharset();
        List<String> results = Files.readAllLines(filePath, charset);

        int max = 0;

        for(String result : results){
            String word = result.split("\t")[2];

            if(word.length() >= max){
                max = word.length();
                System.out.println("Word: " + word + " - Length: " + max);
            }
        }

        System.out.println("Max length: " + max);

    }
}
