package lambdademo;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FileFilterDemo {

    public static void main(String[] args){
        usingClassImplementationOfFilerFilter();
    }

    private static void usingClassImplementationOfFilerFilter(){
        System.out.println("Print files ending with .java");
        File directoryFiles = new File("");
        JavaFileFilter javaFileFilter = new JavaFileFilter();
        File[] files = directoryFiles.listFiles();
        for(File file:files){
            System.out.println(file.getName());
        }
    }

    private static void usingAnonymousImplementationOfFileFilter() {
        System.out.println("Print files ending with .java");
        File directoryFiles = new File("");

    }


}
