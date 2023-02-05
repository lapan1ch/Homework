package additionalHomework.addHomework3;

class RealObject {
    String type;
    byte age;
    char firstLetter;
    private boolean isFunctioning;
    boolean getFunctioning() {
        return isFunctioning;
    }
    void setFunctioning(boolean functioning) {
        isFunctioning = functioning;
    }
    RealObject(String type, boolean isFunctioning) {
        this.type = type;
        this.isFunctioning = isFunctioning;
    }
    RealObject(String type, byte age, char firstLetter) {
        this.type = type;
        this.age = age;
        this.firstLetter = firstLetter;
    }
}
