package mwk3;

import java.util.Scanner;

public class ShopOpen {

    public static void main(String[] args) {
        boolean canBuy;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is Edeka open?");
        boolean isEdekaOpen = scanner.nextBoolean();
        System.out.println("Is Rewe open?");
        boolean isReweOpen = scanner.nextBoolean();
        if (isEdekaOpen || isReweOpen){
            canBuy = true;
        } else {
            canBuy = false;
        }
        System.out.println("Я могу купить еду, это ……" + canBuy);
    }
}




