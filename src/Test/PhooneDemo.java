package Test;

public class PhooneDemo {
    public static void main(String[] args) {
        Phoone myPhone = new Phoone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }
}
