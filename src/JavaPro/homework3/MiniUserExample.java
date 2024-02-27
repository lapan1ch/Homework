package JavaPro.homework3;

public class MiniUserExample {

        public static void main(String[] args) {


            Storage departureStorage = new Storage();
            Storage deliveryStorage = new Storage();

            // Создаем продукты и загружаем их на склад отправления
            Product product1 = new TechProduct("Ноутбук");
            Product product2 = new FoodProduct("Яблоко");
            Product product3 = new BookProduct("Идиот");

            departureStorage.addProductToDispatch(product1);
            departureStorage.addProductToDispatch(product2);
            departureStorage.addProductToDispatch(product3);

            // Создаем большой трак и загружаем продукты
            Truck bigTruck = new BigTruck();
            bigTruck.loadTruck(product1);
            bigTruck.loadTruck(product2);
            bigTruck.loadTruck(product3);

            // Отображаем продукты в большом траке
            bigTruck.displayProductsInTruck();

            // Разгружаем все продукты на склад доставки
            bigTruck.unloadTruck(deliveryStorage);

            // Отображаем продукты в траке и на складе доставки
            bigTruck.displayProductsInTruck();
            deliveryStorage.displayProductsInStorage();
        }
    }

