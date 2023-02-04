package homework2;

class StringPractice {
    public static void main(String[] args) {
        @SuppressWarnings("StringOperationCanBeSimplified") String string = new String("I study Basic Java!");
        System.out.println("Last symbol of text is - '" + string.charAt(string.length()-1) +"'");
        System.out.println("Does text contains word \"Java\" - " + string.contains("Java"));
        System.out.println(string.replace("a","o"));
        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase());
        System.out.println(string.substring(string.indexOf("Java"), string.lastIndexOf("!")));
    }
}
