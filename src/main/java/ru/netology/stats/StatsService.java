package ru.netology.stats;


public class StatsService {

    public long sum(long[] sales) {
        long answer = 0;
        for (long sale : sales) {

            answer += sale;
        }
        return answer;

    }

    public long average(long[] sales) {
        long sum = sum(sales);
        return sum / 12;

    }

    public int maxSalesMonth(long[] sales) {
        int maxi = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxi]) {
                maxi = i;
            }

        }
        return maxi + 1;
    }

    public int minSalesMonth(long[] sales) {
        int mini = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[mini]) {
                mini = i;
            }

        }
        return mini + 1;
    }

    public int belowEverMonth(long[] sales) {
        int count = 0;
        long avg = average(sales);
        for (long sale : sales) {
            if (sale < avg) {
                count++;
            }

        }
        return count;
    }


    public int aboveEverMonth(long[] sales) {
        int count = 0;
        long avg = average(sales);
        for (long sale : sales) {
            if (sale > avg) {
                count++;
            }

        }
        return count;
    }


}











