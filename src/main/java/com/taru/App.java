package com.taru;

import java.time.LocalDate;
import java.util.List;

public class App 
{
    public static void main( String[] args ) {
        DateSorter dateSorter = new DateSorter();
        List<LocalDate> unsortedDates = List.of(
                LocalDate.of(2000, 1, 1),
                LocalDate.of(2000, 1, 2),
                LocalDate.of(2000, 2, 2),
                LocalDate.of(2000, 2, 3),
                LocalDate.of(2000, 3, 1),
                LocalDate.of(2000, 3, 2),
                LocalDate.of(2000, 4, 3),
                LocalDate.of(2000, 4, 4),
                LocalDate.of(2000, 5, 15),
                LocalDate.of(2000, 5, 16),
                LocalDate.of(2000, 6, 5),
                LocalDate.of(2000, 6, 6),
                LocalDate.of(2000, 7, 30),
                LocalDate.of(2000, 8, 14),
                LocalDate.of(2000, 9, 22),
                LocalDate.of(2000, 10, 10),
                LocalDate.of(2000, 11, 10),
                LocalDate.of(2000, 12, 10)
        );

        var dates = dateSorter.sortDates(unsortedDates);

        dates.forEach(d -> System.out.println(d.getMonth() + " - " + d));

    }
}
