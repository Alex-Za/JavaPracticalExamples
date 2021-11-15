package file;

import java.io.File;
import java.io.FilenameFilter;

public class FileExample {
    public void fileFilter() {
        String dirname = "D:\\Prog\\Java\\Projects\\PracticalExamples";
        File file = new File(dirname);
        FilenameFilter only = new OnlyExt("xml");
        String s[] = file.list(only);

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
