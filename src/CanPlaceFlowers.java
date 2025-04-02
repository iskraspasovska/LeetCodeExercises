class Solution2{
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int available = 0;
        int con_0s = 0;
        boolean flag = false;
        for (int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i] == 1){
                if(flag){
                    available += (Math.floorDiv(con_0s-1, 2));
                }
                if(!flag && con_0s>0){
                    available += (Math.floorDiv(con_0s, 2));
                }
                flag = !flag;
                con_0s=0;
            } else if (flowerbed[i] == 0){
                con_0s++;
            }
        }
        if(con_0s>0){
            available += (Math.floorDiv(con_0s-1, 2));
        }
        return available == n;
    }


}

public class CanPlaceFlowers {
    public static void main(String[] args) {

    }
}
