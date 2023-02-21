package Test2;

 class TwoRealDifferentObject {


     String name;
     String model;
     int year;

     boolean isAlive;

     public TwoRealDifferentObject() {
     }


     public String getName() {
         return name;
     }

     public String getModel() {
         return model;
     }

     public int getYear() {
         return year;
     }


     public boolean isAlive() {
         return isAlive;
     }

     public void setName(String name) {
         this.name = name;
     }

     public void setModel(String model) {
         this.model = model;
     }

     public void setYear(int year) {
         this.year = year;
     }

     public void setAlive(boolean alive) {
         isAlive = alive;
     }

     public TwoRealDifferentObject(String name, int year, boolean isAlive) {
         this.name = name;
         this.year = year;
         this.isAlive = isAlive;
     }

     public TwoRealDifferentObject(String name, String model) {
         this.name = name;
         this.model = model;
     }

     @Override
     public String toString() {
         return "TwoRealDifferentObject{" +
                 "name='" + name + '\'' +
                 ", model='" + model + '\'' +
                 ", year=" + year +
                 ", isAlive=" + isAlive +
                 '}';
     }
 }
