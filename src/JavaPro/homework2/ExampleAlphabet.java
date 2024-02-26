package JavaPro.homework2;



public class ExampleAlphabet {

    private static Alphabet[] alphabets;

    public static void main(String[] args) {

        Alphabet1 alphabet1 = new Alphabet1();
        alphabet1.setLetters(new String[]{"A", "B", "C"});
        alphabet1.setName("English alphabet letters. ");


        Alphabet2 alphabet2 = new Alphabet2();
        alphabet2.setLetters(new String[]{"А", "Б", "В", "Г", "Д"});
        alphabet2.setName("Russian alphabet letters. ");



        Alphabet3 alphabet3 = new Alphabet3();
        alphabet3.setLetters(new String[]{"a", "b", "c", "d", "e", "f", "g"});
        alphabet3.setName("English small alphabet letters. ");

        Alphabet[] alphabets = {alphabet1, alphabet2, alphabet3};
        printAllInfo(alphabets);
    }

    public static void printAllInfo(Alphabet[] alphabets) {
        for (Alphabet alphabet : alphabets) {
            alphabet.printAlphabet();
        }



            }


        }



    
    
