package javaprogram;

public class removenumberfromstring {

    public static void main(String[] args) {

        String str = "helloThisIsA1234";
        str = str.replaceAll("[0-9]", "");
        System.out.println(str);
    }
}
