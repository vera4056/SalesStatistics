public class StatsService {

    public long sum(long[] sales) {

        long ans = 0;
        for (long sale : sales) {
            ans += sale;
        }
        return ans;
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
        return maxi;
    }


    public int minSalesMonth(long[] sales) {
        int mini = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[mini]) {
                mini = i;
            }
        }
        return mini;
    }

    public int aboveAverage(long[] sales) {
        int count = 0;
        long avg = average(sales);
        for (long sale : sales) {
            if (sale > avg) {
                count++;
            }
        }
        return count;

    }


    public int belowAverage(long[] sales) {
        int count = 0;
        long avg = average(sales);
        for (long sale : sales) {
            if (sale < avg) {
                count++;
            }
        }
        return count;

    }
}