package org.example.first;

public class PrinterError {
    public static void main(String[] args) {
        String s = "aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";

        System.out.println(printerError(s));

        System.out.println(printerErrorByReplace(s));
    }

    public static String printerErrorByReplace(String s){
        return s.replaceAll("[a-m]", "").length() + "/" + s.length();
    }
    public static String printerError(String s) {
        int length = s.length();
        int errors = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch > 'm' && ch <= 'z') {
                errors++;
            }
        }

        return String.format("%s/%s", errors, length);
    }
}
