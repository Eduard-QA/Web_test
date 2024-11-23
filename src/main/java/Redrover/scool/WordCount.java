package Redrover.scool;

import java.io.*;

public class WordCount {

    private static Counts count(Reader in) throws IOException {
        Counts counts = new Counts();
        BufferedReader br = new BufferedReader(in);
        String line = br.readLine();
        while (line != null){
            counts.lines ++;
            counts.characters += line.length();
            counts.words += line.split("\\s").length;
            line = br.readLine();
        }

        return counts;
    }

    private static void printCount(Counts counts){
        System.out.printf("Lines: %d%nWords: %d%nChars: %d%n", counts.lines, counts.words, counts.characters);
    }

    public static void main(String[] args) throws IOException {
        printCount(count(new FileReader("pom.xml")));
        System.out.println(" 27 => " + "******************************");
        printCount(count(new StringReader("This\nis my\n text\n")));

    }

    static class Counts {
        private int lines = 0;
        private int words = 0;
        private int characters = 0;
    }
}
