/*Problem: Best Time to Buy and Sell Stock

You are given an array prices[] where:

prices[i] represents the stock price on day i.
You can buy the stock only once.
        After buying, you can sell it only once.
You must buy before you sell.
Find the maximum profit you can make.
        Input:
        [7, 1, 5, 3, 6, 4]
        Output:
        5*/

class StocksBuy {

    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        int minprize=prices[0];
        int maxProfit=0;

        for(int i=0;i<prices.length;i++){

            //find min prize
            if(prices[i]<minprize){
                minprize=prices[i];
            }
            int profit=prices[i]-minprize;

            if(profit>maxProfit){
                maxProfit=profit;
            }
        }

        System.out.println("Maximum Profit: " + maxProfit);
    }
}