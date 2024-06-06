package org.example.ARRAYS.service;

import java.util.Arrays;

public class StatsService {

    public long amountOfSales(long[] sales) {
        long amount = 0;                                    //сумма всех продаж
        for (int i = 0; i < sales.length; i++) {
            amount = amount + sales[i];
        }
        return amount;
    }

    public long averageSales(long[] sales) {
        long average = 0;                                   //среднее число всех продаж
        long amount = amountOfSales(sales);
        average = amount / sales.length;
        return average;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;                                  // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {             // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i;                              // запомним его как минимальный
            }
        }

        return minMonth + 1;                               // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;                                  // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {             // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i;                              // запомним его как максимальный
            }
        }

        return maxMonth + 1;                               // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int salesBelowAverage(long[] sales) {
        int lowMonth = 0;                                  // количество месяцев со значением ниже среднего
        long average = averageSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                lowMonth = lowMonth + 1;
            }
        }

        return lowMonth;
    }

    public int salesAboveAverage(long[] sales) {
        int aboveMonth = 0;                                  // количество месяцев со значением выше среднего
        long average = averageSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                aboveMonth = aboveMonth + 1;
            }
        }

        return aboveMonth;
    }
}

