import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String[] words = new String[0]; // Start with an empty array
        String[] wordsSub = new String[0];

        while (!StdIn.isEmpty()) {
            String val = StdIn.readString();
            wordsSub = new String[words.length + 1];
            for (int i = 0; i < words.length; i++){
                wordsSub[i] = words[i];
            }
            wordsSub[words.length] = val;
            words = wordsSub;
        }
        Integer rand = StdRandom.uniformInt​(0, words.length);
        StdOut.println(words[rand]);
    }

}
