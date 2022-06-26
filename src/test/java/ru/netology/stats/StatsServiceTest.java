package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    @Test

    public void shoudSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAnswer = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actualAnswer = service.sum(sales);
        assertEquals(expectedAnswer, actualAnswer);
    }


    @Test

    public void shoudEverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedEverage = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        long actualEverage = service.sum(sales) / 12;
        assertEquals(expectedEverage, actualEverage);
    }


    @Test

    public void shoudFindMaxSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMaxSalesMonth = 8;
        long actualMaxSalesMonth = service.maxSalesMonth(sales);
        assertEquals(expectedMaxSalesMonth, actualMaxSalesMonth);
    }


    @Test

    public void shoudFindMinSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMinSalesMonth = 9;
        long actualMinSalesMonth = service.minSalesMonth(sales);
        assertEquals(expectedMinSalesMonth, actualMinSalesMonth);
    }


    @Test

    public void shoudFindBelowEverMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedBelowEver = 5;
        long actualBelowEver = service.belowEverMonth(sales);
        assertEquals(expectedBelowEver, actualBelowEver);
    }


    @Test

    public void shoudFindAboveEverMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAboveEver = 5;
        long actualAboveEver = service.aboveEverMonth(sales);
        assertEquals(expectedAboveEver, actualAboveEver);
    }


}
