class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int a=flowerbed.length;
        if(n==0)
            return true;
        if(flowerbed==null && n>0) return false;
        if(a==1 && flowerbed[0]==0) return true;
        
        if(flowerbed[0]==0 && flowerbed[1]==0){
            flowerbed[0]=1;
            n--;
        }
        for(int i=1;i<a-1;i++){
            if(flowerbed[i-1]==0 && flowerbed[i]==0 && flowerbed[i+1]==0){
                flowerbed[i]=1;
                n--;
            }
            if(n==0) return true;
        }
        if(flowerbed[a-1]==0 && flowerbed[a-2]==0){
            n--;
        }
        if(n==0) return true;
        return false;
    }
}