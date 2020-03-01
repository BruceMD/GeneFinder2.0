import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class ReadDataFile {
    public static ArrayList<String> Sequence() throws Exception {
//        File file = new File("C:\\Users\\ASUS\\Desktop\\GeneFinderData\\HIV.fasta");
        File file = new File("C:\\Users\\ASUS\\Desktop\\GeneFinderData\\Example1(PotySeqs).fasta");
//        File file = new File("C:\\Users\\ASUS\\Desktop\\GeneFinderData\\Example2(A-J-cons-kal153).fasta");
//        File file = new File("C:\\Users\\ASUS\\Desktop\\GeneFinderData\\Example3(FMDV).fasta");


        BufferedReader buffReader = new BufferedReader(new FileReader(file));

        String tempLine = null;
        int index = -1;
        ArrayList<String> sequences = new ArrayList<>();

        while ((tempLine = buffReader.readLine()) != null) {
            if(tempLine.contains(">")){
                sequences.add("");
                index ++;
            }
            else{
                sequences.set(index, sequences.get(index) + tempLine.trim().toUpperCase());
            }
        }
        buffReader.close();

        return sequences;
    }
}
