import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Let's begin");

        ArrayList<String> sequences = ReadDataFile.Sequence();

        for (int i = 0; i < sequences.size(); i ++){
            System.out.println(sequences.get(i));
        }
        System.out.println(sequences.size());
    }
}
