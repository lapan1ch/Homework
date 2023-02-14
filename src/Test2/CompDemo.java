package Test2;

public class CompDemo {

        public static void main(String[] args) {
            Comp dell = new Comp("Dell", "XXX-1");
            String manufacturer = dell.getManufacturer();
            String model = dell.getModel();
            System.out.println("Computer manufacturer = " + manufacturer);
            System.out.println("Computer model = " + model);
        }
}
