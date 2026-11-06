//Determine the best time to buy or sell the stock given the price of shares for a particular week.Determine the
//max profit which can be made . note that the shares brought earlier are only eligible for selling.if price shown
// is 0 it means it was a holiday and market was closed for buying or selling .if no profit can be made return 0.
// also shares cannot be brought on last day because they cannot be sold.
//ip 10,6,4,2,0,8,1 max profit =6
import java.util.Arrays;
import java.math.*;
public class E {
    public static void main(String[] args)
    {
        int num[]={10,6,4,2,0,8,1};
        System.out.println(Arrays.toString(num));
        System.out.println("Max profit is "+prr(num));
    }
    static int prr(int num[])
    {
        int profit=0;
        int buy=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++)
        {
            if(num[i]==0)
                continue;
            if(buy>num[i]&& i!= num.length-1)
                buy=num[i];
            if(profit<num[i]-buy)
                profit=num[i]-buy;
        }
        System.out.println("Buy price is "+buy);
        System.out.println("Sell price is "+(buy+profit));
        return profit;
    }
}
//next one is reverse the number including the max value=0