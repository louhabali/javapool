import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileManager {

    public static void createFile(String fileName, String content) throws IOException {
        Path path = Paths.get(fileName);
        Files.write(path, content.getBytes());
    }

    public static String getContentFile(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        return Files.readString(path);
    }

    public static void deleteFile(String fileName) {
        Path path = Paths.get(fileName);
        try {
            Files.deleteIfExists(path);
        } catch (IOException e) {
            System.err.println("Failed to delete file: " + fileName);
            e.printStackTrace();
        }
    }
}
