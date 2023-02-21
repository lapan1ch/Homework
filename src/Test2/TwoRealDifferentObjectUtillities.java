package Test2;

public class TwoRealDifferentObjectUtillities {

    TwoRealDifferentObject createObjectwithallParameters(String name, int year, boolean isAlive){
        return new TwoRealDifferentObject(name, year, isAlive);
    }

    TwoRealDifferentObject createObjectwithTwoParameters(String name, String model) {
        return new TwoRealDifferentObject(name, model);
    }

    public void changeYear(TwoRealDifferentObject twoRealDifferentObject,  int neWyear ){
        twoRealDifferentObject.setYear(neWyear);
    }
 public void changeName(TwoRealDifferentObject twoRealDifferentObject, String neWname){
        twoRealDifferentObject.setName(neWname);
 }

}

