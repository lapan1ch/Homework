package JavaPro.homework3;

public class MediumTruck extends Truck{



  private Product[] products; // Массив для хранения загруженных продуктов

  private int currentCapacity;

  private int maxCapacity;
  public MediumTruck() {
    super("medium", 6,4); // Максимальный объем для среднего трака: 6 товаров
    products = new Product[maxCapacity];
  }

  @Override
  public void loadTruck(Product product) {
    if (currentCapacity < maxCapacity) {
      products[currentCapacity] = product;
      currentCapacity++;
      System.out.println(product.getName() + " загружен в средний трак.");
    } else {
      System.out.println("Трак уже полностью загружен. Невозможно добавить " + product.getName());
    }
  }

  @Override
  public void unloadTruck(Storage deliveryStorage) {
    System.out.println("Разгрузка товаров из среднего трака:");
    for (int i = 0; i < currentCapacity; i++) {
      System.out.println(products[i].getName());
    }
    currentCapacity = 0; // Обнуляем текущий объем товаров
  }
@Override
  public void displayProductsInTruck() {
    System.out.println("Список продуктов в среднем траке:");
    for (int i = 0; i < currentCapacity; i++) {
      System.out.println(products[i].getName());
    }
  }



}




