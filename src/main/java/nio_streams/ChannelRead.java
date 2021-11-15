package nio_streams;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ChannelRead {
    public void seekableByteChannelRead() {
        int count;
        Path filepath = null;

        try {
            filepath = Paths.get("test.txt");
        } catch (InvalidPathException e) {
            System.out.println(e.getMessage());
        }

        try (SeekableByteChannel fileChanel = Files.newByteChannel(filepath)) {
            ByteBuffer buf = ByteBuffer.allocate(128);

            do {
                count = fileChanel.read(buf);

                if (count != -1) {
                    buf.rewind(); //preparing buffer for reading data

                    for (int i = 0; i < count; i++) {
                        System.out.println((char) buf.get());
                    }
                }
            } while (count != -1);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void mappedChanelRead() {
        try (FileChannel fileChannel = (FileChannel) Files.newByteChannel(Paths.get("test.txt"))) {

            long fileSize = fileChannel.size();

            MappedByteBuffer buf = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, fileSize);

            for (int i = 0; i < fileSize; i++) {
                System.out.println((char) buf.get());

                System.out.println();
            }

        } catch (InvalidPathException | IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
