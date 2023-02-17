public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public long mediumCropped(){
        long max = -1;
        long min = 10_000;
        long amount =0;
        long result =0;
        for (long sale:sales){
            if(sale > max){
                max=sale;
            }
            if(sale<min){
                min=sale;
            }
            amount+=sale;
        }
        result = (amount - max - min)/(sales.length-2);
        return result;
    }

}
