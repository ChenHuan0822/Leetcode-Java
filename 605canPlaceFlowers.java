class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        // if len == 0 return false if len == 1 return flowered[0]== 0 && n <= 1
        if (len == 0) {
            return false;
        }
        if (n == 0) {
            return true;
        }
        if (len == 1) {
            return flowerbed[0] == 0 && n == 1;
        }

        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            n -= 1;
            flowerbed[0] = 1;
        }
        int i = 1;
        while(i < len - 1 && n > 0) {
            if (flowerbed[i-1] == 0 && flowerbed[i] == 0 && flowerbed[i+1] == 0) {
                n -= 1;
                flowerbed[i] = 1;
            } 
            i += 1;
        }
        if (flowerbed[len-2] == 0 && flowerbed[len-1] == 0) {
            n -= 1;
        }

        return n <= 0;
    }
}