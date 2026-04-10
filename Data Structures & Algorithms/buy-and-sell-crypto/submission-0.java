class Solution {
    public int maxProfit(int[] prices) {
        boolean noProfit = true;
        for(int i = 1; i<prices.length; i++){
            if(prices[i-1]-prices[i]<0){
                noProfit = false;
            }
        }
        if(noProfit){
            return 0;
        } 
            int max = 0;
            int l = 0;
            int r = prices.length-1;
            List<Integer> list = new ArrayList<>();
            while(l<r){
                
                while(l<r){
                    
                    if(prices[r] - prices[l]>0){
                        System.out.println(prices[r] - prices[l]);
                        list.add(prices[r] - prices[l]);
                    }
                    r--;
                }
                r = prices.length-1;
                l++;
            }
        System.out.println(list);

        return list.stream().max(Integer::compare).get();
    }
}
