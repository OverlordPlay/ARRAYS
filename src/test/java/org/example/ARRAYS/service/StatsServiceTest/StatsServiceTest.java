package org.example.ARRAYS.service.StatsServiceTest;

import org.example.ARRAYS.service.StatsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class StatsServiceTest {

    @Test
    public void shouldFindAmount() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmount = 180;
        int actualAmount = service.amountOfSales(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void findAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmount = 15;
        int actualAmount = service.averageSales(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void shouldFindMinSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmount = 9;
        long actualAmount = service.minSales(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmount = 8;
        long actualAmount = service.maxSales(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void findSalesBelowAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmount = 5;
        int actualAmount = service.salesBelowAverage(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void findSalesAboveAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmount = 5;
        int actualAmount = service.salesAboveAverage(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

}
