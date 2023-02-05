package additionalHomework.addHomework3;

class RealObjectDemo {
    public static void main(String[] args) {
        RealObjectUtilities realObjectUtilities = new RealObjectUtilities();
        RealObject firstObject = realObjectUtilities.createTypeAndfunctionality("Light bulb", true);
        System.out.println(firstObject.type + " is on - '" + firstObject.getFunctioning() + "'");
        realObjectUtilities.changeStatus(firstObject, false);
        System.out.println(firstObject.type + " is on - '" + firstObject.getFunctioning() + "'");
        RealObject secondObject = realObjectUtilities.createTypeAgeAndfirstLetter("Laptop", (byte) 8, 'A');
        System.out.println("I have a " + secondObject.type + ", which is " + secondObject.age
                + " years old & it starts with a letter - \"" + secondObject.firstLetter + "\"");
    }
}
