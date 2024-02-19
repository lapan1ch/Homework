package JavaPro.homework2;

public class Alphabet3 extends Alphabet {

     private String[] letters;


    public String[] getLetters() {
        return letters;
    }

    public void setLetters(String[] letters) {
        this.letters = letters;
    }

    @Override
    public void printAlphabet() {
        super.printAlphabet();
        System.out.println("English small alphabet letters ");
        for (String letter : letters) {
            System.out.print(letter + " ");
        }
        System.out.println();
    }


}
