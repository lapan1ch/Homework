package Test2;

 class FzzBzz {

    public String detect(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FzzBzz";
        }
        if (number % 3 == 0) {
            return "Fzz";
        }
        if (number % 5 == 0) {
            return "Bzz";
        } else {
            return "" + number;
        }
    }

}
