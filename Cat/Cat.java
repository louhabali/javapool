import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Cat {
    public static void cat(String[] args) throws IOException {
        if (args.length == 0) {
            return;
        }

        byte[] b = new byte[8192];
        // we can use try and finally if wedont want try-with-resources here haha , 
        //so in finally we put in.close to close our fd
        try (InputStream in = new FileInputStream(args[0])) {
            int readb;
            while ((readb = in.read(b)) != -1) {
                System.out.write(b, 0, readb);
            }
        }
        System.out.flush();
    }
}
