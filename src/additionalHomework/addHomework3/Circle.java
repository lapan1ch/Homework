package additionalHomework.addHomework3;

class Circle {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    double calculateArea(){
        return radius * radius * Math.PI;
    }
}
