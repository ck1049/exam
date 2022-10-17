public class Main2 {

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] left = new int[12];
        int[] right = new int[12];
        int length = height.length;
        int result = 0;
        for (int i = 1; i < length - 1; i++){
            left[i] = Math.max(left[i-1], height[i-1]);
        }
        for (int i = length - 2; i >= 1; i--){
            right[i] = Math.max(right[i+1], height[i+1]);
        }
        for (int i = 1; i < length - 1; i++) {
            int temp = Math.min(left[i], right[i]) - height[i];
            if (temp > 0){
                result += temp;
            }
        }
        System.out.println(result);
    }
}
