package JavaPro.homework3;

public class SmallTruck extends Truck{

    private  Product[] products; // Массив для хранения загруженных продуктов

    public SmallTruck() {
        super("small", 4,2); // Максимальный объем для маленького трака: 4 товара

    }

    @Override
    public void loadTruck(Product product) {
        if (currentCapacity < maxCapacity) {
            products[currentCapacity] = product;
            currentCapacity++;
            System.out.println(product.getName() + " загружен в маленький трак.");
        } else {
            System.out.println("Трак уже полностью загружен. Невозможно добавить " + product.getName());
        }
    }

    @Override
    public void unloadTruck(Storage deliveryStorage) {
        System.out.println("Разгрузка товаров из маленького трака:");
        for (int i = 0; i < currentCapacity; i++) {
            System.out.println(products[i].getName());
        }
        currentCapacity = 0; // Обнуляем текущий объем товаров
    }
      @Override
    public void displayProductsInTruck() {
        System.out.println("Список продуктов в маленьком траке:");
        for (int i = 0; i < currentCapacity; i++) {
            System.out.println(products[i].getName());
        }
    }
}



