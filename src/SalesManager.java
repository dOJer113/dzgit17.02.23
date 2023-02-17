public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public int mediumCropped(){
        int max = -1;
        int min = 10_000;
        int amount =0;
        int result =0;
        for (int sale:sales){
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
