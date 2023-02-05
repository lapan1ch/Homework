package additionalHomework.addHomework3;

class RealObjectUtilities {
    RealObject createTypeAndfunctionality(String type, boolean fn){
        return new RealObject(type, fn);
    }
    RealObject createTypeAgeAndfirstLetter(String type, byte age, char ch){
        return new RealObject(type,age,ch);
    }
    void changeStatus(RealObject realObject, boolean fn){
        realObject.setFunctioning(fn);
        System.out.println("Flipped the switcher");
    }
}
