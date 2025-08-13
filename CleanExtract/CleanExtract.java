public class CleanExtract {
    public static String extract(String s) {
        if (s == null) {
            return null;
        }
        String[] s1 = s.split("\\|");
        StringBuilder sb = new StringBuilder();
        for (String ele : s1) {
            String e = ele.trim();
            if (e.isEmpty()) {
                continue;
            }
            if (e.startsWith(".") && e.endsWith(".")) {
                 if (e.length() > 2) {
                    sb.append(e.substring(1, e.length() - 1).trim());
                } else {
        
                        continue;
    }
            } else if (!e.startsWith(".") && !e.endsWith(".") && !e.contains(".")) {
                sb.append(e);
            } else if (e.contains(".")) {
                int index = e.indexOf('.'); 
                char nextChar = e.charAt(index + 1);
                if(nextChar =='.') {
                    //System.out.println("66");
                    continue;
                }
                sb.append(e.substring(index + 1).trim());
            }
            sb.append(" ");  
        }
        return sb.toString().trim();
    }
}
