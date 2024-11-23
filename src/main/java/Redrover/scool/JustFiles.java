package Redrover.scool;

import java.io.File;

public class JustFiles {
    public static void main (String[] args){
        File pom = new File("C:/Java/Web_test/pom.xml");
        System.out.println("08 => " + pom.getAbsolutePath());
        System.out.println(" 09 => " + pom.exists());
        System.out.println(" 10 => " + pom.isDirectory());
        File perentDir = pom.getParentFile();
        System.out.println(" 12 => " + perentDir.isDirectory());
        System.out.println(" 13 => " + perentDir.getName());
        File src = new File(perentDir, "src");
        System.out.println(" 15 => " + src.getAbsolutePath());

        for(File f:src.listFiles()){
            System.out.println(" 18 => " + f.getAbsolutePath());
        }

        File someDir = new File("someDir");
        File nestedDir = new File(someDir, "nestedDir");
        System.out.println(" 23 => " + nestedDir.getAbsolutePath());
        System.out.println(" 24 => " + nestedDir.exists());
        System.out.println(" 25 => " + nestedDir.mkdir()); // невозможно создать дочернюю папку если нет родительской
        System.out.println(" 26 => " + nestedDir.mkdirs());  // создались все папки
        System.out.println(" 27 => " + File.separatorChar);



    }
}
