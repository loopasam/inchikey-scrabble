import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by loopasam on 5/20/16.
 */
public class Launcher {

    public static void main(String[] args) throws IOException {

        //http://www.puzzlers.org/dokuwiki/doku.php?id=solving%3awordlists%3aabout%3astart

        //Read keys
        Path filePath = new File("/home/loopasam/IdeaProjects/inchikey-scrabble/src/main/resources/chembl_21_chemreps.txt").toPath();
        Charset charset = Charset.defaultCharset();
        List<String> molecules = Files.readAllLines(filePath, charset);

        System.out.println(molecules.size());

        //Read words
        filePath = new File("/home/loopasam/IdeaProjects/inchikey-scrabble/src/main/resources/enable1.txt").toPath();
        List<String> raw_words = Files.readAllLines(filePath, charset);

        System.out.println(raw_words.size());

        List<String> words = new ArrayList<String>();
        for(String raw_word : raw_words) {

            if(raw_word.length() > 5){
                words.add(raw_word.toLowerCase());
            }
        }


        int total = molecules.size();
        int counter = 0;

        PrintWriter printWriter = new PrintWriter ("/home/loopasam/IdeaProjects/inchikey-scrabble/src/main/resources/results.txt");

        for (String molecule : molecules){

            String[] splits = molecule.split("\t");
            String id = splits[0];
            String inchikey = splits[3].toLowerCase();

                if(counter%10000 == 0){
                    float percent = counter * 100f / total;

                    System.out.println(counter + "/" + total + "   " + percent + "%");
                }

                counter++;

                //System.out.println(inchikey);
                for (String word : words){

                    if(inchikey.contains(word)){

                        printWriter.println(id + "\t" + inchikey + "\t" + word);
                    }
                }

        }

        printWriter.close ();

    }
}
