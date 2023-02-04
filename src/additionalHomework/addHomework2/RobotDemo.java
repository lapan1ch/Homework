package additionalHomework.addHomework2;

class RobotDemo {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.sayHello();
        robot.sayYorName();
        Robot robot1 = new Robot("Rider");
        robot1.sayHello();
        robot1.sayYorName();
        Robot robot2 = new Robot("John");
        robot2.sayHello();
        robot2.sayYorName();
    }
}
