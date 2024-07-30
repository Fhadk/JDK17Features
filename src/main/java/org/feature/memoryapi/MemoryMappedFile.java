package org.feature.memoryapi;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class MemoryMappedFile {
    public static byte[] readData;

    public static String implementation(String data)  {

        // Get the file channel and Create a random access file for read and write operations
        try(RandomAccessFile file = new RandomAccessFile("example.txt", "rw");
            FileChannel channel = file.getChannel()){

            // Map the file into memory
            MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_WRITE, 0, 1024);

            // Write data to the memory-mapped file
            buffer.put(data.getBytes());

            // Read data from the memory-mapped file
            buffer.flip();
            readData = new byte[data.length()];
            buffer.get(readData);

        }catch (IOException ioException){
                System.out.println(ioException.getMessage());
        }
        return (new String(readData));
    }
}
