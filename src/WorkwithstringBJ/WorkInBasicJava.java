package WorkwithstringBJ;

public class WorkInBasicJava {
    public static void main(String[] args) {


        String text = new String("I study Basic Java !");

        System.out.println(text);
        System.out.println("Text length is " + text.length());

        boolean resultContains = text.contains("Java");

        System.out.println("Is text contains our substring -? " + resultContains );

         String substring = text.substring(14,18);

        System.out.println(substring);

        String textUpperCase = text.toUpperCase();

        System.out.println(textUpperCase);

        System.out.println(text.toLowerCase());

        System.out.println(text.replaceAll("a", "o" ));

        System.out.println(text.charAt(19));


    }
}
