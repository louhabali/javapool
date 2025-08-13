import java.io.File;

public class FileSearch {
    public static String searchFile(String fileName) {
        File document = new File("documents");
        File filep = findFileRecursive(document, fileName);
       
        if (filep != null) {
            String absP = filep.getAbsolutePath();
            String docP = document.getAbsolutePath();
             //System.out.println(absP);
            // System.out.println(docP);
            if (absP.startsWith(docP)) {
                String rPath = absP.substring(docP.length() + 1);
                return "documents/" + rPath.replace(File.separatorChar, '/');
            } else {
                return absP.replace(File.separatorChar, '/');
            }
        } else {
            return null;  
        }
    }
    private static File findFileRecursive(File dir, String fileName) {
        File[] files = dir.listFiles();
        if (files == null) return null;

        for (File file : files) {
            if (file.isDirectory()) {
                File found = findFileRecursive(file, fileName);
                if (found != null) return found;
            } else if (file.getName().equals(fileName)) {
                return file;
            }
        }
        return null;
    }
}
