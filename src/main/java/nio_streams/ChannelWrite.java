package nio_streams;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ChannelWrite {
    public void explicitChannelWrite() {
        try (FileChannel fileChannel = (FileChannel) Files.newByteChannel(Paths.get("test.txt"), StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {

            ByteBuffer buffer = ByteBuffer.allocate(26);

            for (int i = 0; i < 26; i++) {
                buffer.put((byte)('A' + i));
            }

            buffer.rewind(); // zeroing current position

            fileChannel.write(buffer);

        } catch (InvalidPathException | IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void mappedChannelWrite() {
        try (FileChannel fileChannel = (FileChannel) Files.newByteChannel(Paths.get("test.txt"),
                StandardOpenOption.WRITE, StandardOpenOption.READ, StandardOpenOption.CREATE)) {
            MappedByteBuffer buffer = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, 26);

            for (int i = 0; i < 26; i++) {
                buffer.put((byte)('A' + i));
            }
        } catch (InvalidPathException | IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
