class Solution {
    public boolean lemonadeChange(int[] bills) {
        // 如果说客户支付的是5块钱，nothing to worry
        // 如果说客户支付的是10块钱，需要看手上有没有单独的5块钱
        // 如果说客户支付的是20块钱，需要看手上凑齐来有没有15块，有两种组合：5,5,5 还有 5,10
        int numOfFive = 0;
        int numOfTen = 0;

        for (int i = 0; i < bills.length; i ++) {
            if (bills[i] == 5) {
                numOfFive += 1;
            } else if (bills[i] == 10) {
                if (numOfFive == 0) {
                    return false;
                } else {
                    numOfTen += 1;
                    numOfFive -= 1;
                }
            } else {
                if (numOfFive > 0 && numOfTen > 0) {
                    numOfFive -= 1;
                    numOfTen -= 1;
                } else if (numOfFive >= 3) {
                    numOfFive -= 3;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}