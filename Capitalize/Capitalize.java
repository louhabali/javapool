import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        if (args.length < 2) {
            return;
        }
        String c = Files.readString(Paths.get(args[0]));
        c = c.trim().replaceAll("\\s+", "ali");
        StringBuilder res = new StringBuilder();
        String[] words = c.split("ali");
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                res.append(Character.toUpperCase(words[i].charAt(0)));
                if (words[i].length() > 1) {
                    res.append(words[i].substring(1).toLowerCase());
                }
                if (i < words.length - 1) {
                    res.append(" ");
                }
            }
        }

        Files.writeString(Paths.get(args[1]), res.toString());
    }
}
