import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord{
    public static void main(String[] args) {
        int i = 1;
        String result = "";
        while (!StdIn.isEmpty())
        {
            String next = StdIn.readString();
            if (StdRandom.bernoulli(1.0 / i))
            {
                result = next;
            }
            i++;
        }
        System.out.println(result);
    }
}