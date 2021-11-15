package nio_streams;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class FilePaths {
    public void testFilePath() {
        Path filePath = Paths.get("test.txt");

        if (Files.exists(filePath)) {
            System.out.println("File exists");
        }

        try {
            if (Files.isHidden(filePath)) {
                System.out.println("File is hidden");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (Files.isWritable(filePath) && Files.isReadable(filePath)) {
            System.out.println("File available for write and read");
        }

        try {
            BasicFileAttributes attributes = Files.readAttributes(filePath, BasicFileAttributes.class);
            if (attributes.isDirectory()) {
                System.out.println("It is directory");
            }

            if (attributes.isRegularFile()) {
                System.out.println("This is regular file");
            }

            System.out.println("Time last modification: " + attributes.lastModifiedTime());
            System.out.println("File size: " + attributes.size() + " bytes");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void runTestDirectoryInfo() {
        String dirName = "D:\\Книги";

        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(dirName))) {
            for (Path entry:  directoryStream) {
                BasicFileAttributes attributes = Files.readAttributes(entry, BasicFileAttributes.class);

                if (attributes.isDirectory()) {
                    System.out.println("<DIR>");
                } else {
                    System.out.println(entry.getName(1));
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}