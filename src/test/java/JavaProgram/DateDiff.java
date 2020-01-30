package javaprogram;

//package SelenCodes;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class DateDiff {

    public static void main(String[] args) {
        LocalDate dateOfBirth = LocalDate.of(2018, Month.JANUARY, 23);
        LocalDate currentDate = LocalDate.of(2019, Month.APRIL, 23);
        LocalDate currentDate20 = LocalDate.of(2020, Month.APRIL, 23);
        LocalDate currentDate21 = LocalDate.of(2021, Month.APRIL, 23);
        LocalDate currentDate22 = LocalDate.of(2023, Month.APRIL, 23);
        long diffInDays = ChronoUnit.DAYS.between(dateOfBirth, currentDate);
        float diffInMonths = ChronoUnit.MONTHS.between(dateOfBirth, currentDate);
        long diffInYears = ChronoUnit.YEARS.between(dateOfBirth, currentDate);

        System.out.println(diffInMonths / 12);
    }
}

