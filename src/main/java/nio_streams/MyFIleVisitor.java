package nio_streams;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class MyFIleVisitor extends SimpleFileVisitor<Path> {
    public FileVisitResult visitFile(Path path, BasicFileAttributes attributes) {
        System.out.println(path);
        return FileVisitResult.CONTINUE;
    }

    public void run() {
        String dirName = "D:\\Книги";

        System.out.println("Tree of catalogs, started with catalog " + dirName + ":\n");

        try {
            Files.walkFileTree(Paths.get(dirName), new MyFIleVisitor());
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
