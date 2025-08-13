import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CatInFile {

    public static void cat(String[] args) throws IOException {
        if (args.length == 0) {
            return;
        }
        try (BufferedInputStream binputs = new BufferedInputStream(System.in); FileOutputStream foutputs = new FileOutputStream(args[0])) {
            byte[] b = new byte[1024];
            int readb;
            while ((readb = binputs.read(b)) != -1) {
                foutputs.write(b, 0, readb);
            }
        }
    }

}