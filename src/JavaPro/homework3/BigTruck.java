package JavaPro.homework3;

class BigTruck extends Truck {

    private Product[] products;
    private int currentCapacity;

    public BigTruck() {
        super("big", 10,8); // Максимальный объем для большого трака: 10 товаров
        products = new Product[maxCapacity];
    }

    @Override
    public void loadTruck(Product product) {
        if (currentCapacity < maxCapacity) {
            products[currentCapacity] = product;
            currentCapacity++;
            System.out.println(product.getName() + " загружен в большой трак.");
        } else {
            System.out.println("Трак уже полностью загружен. Невозможно добавить " + product.getName());
        }
    }

    @Override
    public void unloadTruck(Storage deliveryStorage) {
        System.out.println("Разгрузка товаров из большого трака:");
        for (int i = 0; i < currentCapacity; i++) {
            System.out.println(products[i].getName());
        }
        currentCapacity = 0; // Обнуляем текущий объем товаров
    }

    @Override
    public void displayProductsInTruck () {
            System.out.println("Список продуктов в большом траке:");
            for (int i = 0; i < currentCapacity; i++) {
                System.out.println(products[i].getName());
            }
        }
    }
