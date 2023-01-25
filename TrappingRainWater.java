public class TrappingRainWater{
    public static int getWaterUnits (int[] buildinArray) {
         int[] left = new int[buildinArray.length];
         int[] right = new int[buildinArray.length];
         int waterUnits = 0;
         left[0] = buildinArray[0];
         for (int leftIndex = 1; leftIndex < left. length; leftIndex++) {
            left[leftIndex] = Math.max(left [leftIndex - 1], buildinArray[leftIndex]);
         }
         right[buildinArray.length - 1]= buildinArray[buildinArray.length-1];
         for (int rightIndex = buildinArray.length - 2; rightIndex >= 0;rightIndex--) {
             right [rightIndex] = Math.max(right[rightIndex  + 1], buildinArray [rightIndex]);
         }
         for (int currentIndex = 0; currentIndex < buildinArray. length; currentIndex++) {
            waterUnits = waterUnits + (Math.min( left[currentIndex], right[currentIndex]) -buildinArray[currentIndex]);
         }
         return waterUnits;
        }
    public static void main(String[] args) {
 int a[] = {5,0,5,3,2,1,4};
 System.out.println(getWaterUnits(a));      
}

}