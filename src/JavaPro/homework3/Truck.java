package JavaPro.homework3;


     abstract class Truck {
         private String type; // Тип трака (big, medium, small)
         int maxCapacity; // Максимальный объем товаров

         int currentCapacity; // Текущий объём товаров


         public Truck(String type, int maxCapacity, int currentCapacity) {
             this.type = type;
             this.maxCapacity = maxCapacity;
             this.currentCapacity = currentCapacity;
         }

         public Truck(String type, int maxCapacity) {
             this.type = type;
             this.maxCapacity = maxCapacity;
         }

         // Метод загрузки товаров в трак
         public abstract void loadTruck(Product product);

         // Метод разгрузки товаров из трака
         public abstract void unloadTruck(Storage deliveryStorage);

         // Метод для вывода списка продуктов в траке
         public void displayProductsInStorage() {
         }

         public abstract void displayProductsInTruck();
     }