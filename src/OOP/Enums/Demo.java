package OOP.Enums;

import java.time.LocalDate;
import java.time.Month;

public class Demo {
    public static void main(String[] args) {
        Drinks redBull = Drinks.RED_BULL;

        Drinks.valueOf(redBull.name());

        Drinks[] drinks = Drinks.values();

        for (Drinks drink : drinks){
            System.out.println(drink.expiryDate);
        }

        LocalDate localDate = LocalDate.of(2024, Month.APRIL,14);
        LocalDate localDate1 = LocalDate.of(2024,4,14);

        System.out.println("Vlera e prill: " + Month.APRIL.getValue());
        System.out.println(Drinks.COCA_COLA.sugarLevel);
        System.out.println(Drinks.COCA_COLA.expiryDate);
    }
}
