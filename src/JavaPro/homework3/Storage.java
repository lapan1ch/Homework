package JavaPro.homework3;

    class Storage {
        private Product[] dispatchStorage;
        private Product[] deliveryStorage;
        private int dispatchCount; // Количество продуктов на складе отправления
        private int deliveryCount; // Количество продуктов на складе доставки

        public Storage() {
            this.dispatchStorage = new Product[10]; // Массив для склада отправления
            this.deliveryStorage = new Product[10]; // Массив для склада доставки
            this.dispatchCount = 0;
            this.deliveryCount = 0;
        }

        // Метод для добавления продукта на склад отправления
        public void addProductToDispatch(Product product) {
            if (dispatchCount < dispatchStorage.length) {
                dispatchStorage[dispatchCount++] = product;
                System.out.println("Продукт '" + product.getName() + "' добавлен на склад отправления.");
            } else {
                System.out.println("Склад отправления заполнен.");
            }
        }

        // Метод для добавления продукта на склад доставки
        public void addProductToDelivery(Product product) {
            if (deliveryCount < deliveryStorage.length) {
                deliveryStorage[deliveryCount++] = product;
                System.out.println("Продукт '" + product.getName() + "' добавлен на склад доставки.");
            } else {
                System.out.println("Склад доставки заполнен.");
            }
        }


        public void displayProductsInStorage() {System.out.println("Продукты на складе отправления:");
            for (int i = 0; i < dispatchCount; i++) {
                System.out.println(dispatchStorage[i].getName());
            }

            System.out.println("Продукты на складе доставки:");
            for (int i = 0; i < deliveryCount; i++) {
                System.out.println(deliveryStorage[i].getName());
            }
        }
    }


