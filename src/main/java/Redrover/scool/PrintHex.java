package Redrover.scool;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class PrintHex {

    public static void printHex(InputStream is, PrintStream out) throws IOException {
        int dataByte = is.read();
        while (dataByte > -1) {
            System.out.print(Integer.toHexString(dataByte));
            dataByte = is.read();
        }
    }

    public static void main(String[] args) throws IOException {
        try (FileInputStream is = new FileInputStream("pom.xml")) {
            printHex(is, System.err);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


