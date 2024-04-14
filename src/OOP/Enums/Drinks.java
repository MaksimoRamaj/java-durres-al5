package OOP.Enums;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

public enum Drinks {
    WATER(1,LocalDate.of(2025, Month.DECEMBER,15)),
    COCA_COLA(40,LocalDate.of(2027, Month.FEBRUARY,15)),
    RED_BULL(55,LocalDate.of(2028, Month.AUGUST,15));

    int sugarLevel;
    LocalDate expiryDate;

    Drinks(int sugarLevel,LocalDate expiryDate) {
        this.sugarLevel = sugarLevel;
        this.expiryDate = expiryDate;
    }
}
