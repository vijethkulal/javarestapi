package javaprogram;

public class runcountencoding {

    public static void main(String[] args) {

        String a = "aaabbccc";
        for (int i = 0; i < a.length(); i++) {
            int count = 1;
            while (i < a.length() - 1 && a.charAt(i) == a.charAt(i + 1)) {
                count++;
                i++;
            }
            System.out.print(a.charAt(i));
            System.out.print(count);
        }
    }
}
