public class RegexReplace {

    public static String removeUnits(String s) {
        return s.replaceAll("(\\d)(cm|€)( |$)", "$1$3");

    }

    public static String obfuscateEmail(String s) {
        String[] parts = s.split("@");
        if (parts.length != 2) return s;

        String u = parts[0];
        String domain = parts[1];
        if (u.matches(".*[-._].*")) {
            String[] splited = u.split("[-._]");
            u = u.replaceAll("(?<=[-._]).*", "*".repeat(splited[1].length()));
            
        } else {
            if (u.length() > 3) {
                StringBuilder sb = new StringBuilder(u);
                for (int i = 3; i < u.length(); i++) {
                    sb.setCharAt(i, '*');
                }
                u = sb.toString();
            }
        }
        String[] domainParts = domain.split("\\.");

        if (domainParts.length == 3) {
            domainParts[0] = "*".repeat(domainParts[0].length());
            domainParts[2] = "*".repeat(domainParts[2].length());
        } else if (domainParts.length >= 2) {
            String second = domainParts[domainParts.length - 2];
            String top = domainParts[domainParts.length - 1];

            if (!(top.equals("com") || top.equals("org") || top.equals("net"))) {
                domainParts[domainParts.length - 2] = "*".repeat(second.length());
                domainParts[domainParts.length - 1] = "*".repeat(top.length());
            } else {
                domainParts[domainParts.length - 2] = "*".repeat(second.length());
            }
        }

        domain = String.join(".", domainParts);
        return u + "@" + domain;
    }
}

