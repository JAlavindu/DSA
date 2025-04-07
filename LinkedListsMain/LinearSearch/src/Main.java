public class Main {
    public static void main(String[] args) {
        int nums[] = {5, 7, 9, 11, 13};
        int target = 11;


        int result = linearSearch(nums, target);
        int result2 = binarySearch(nums, target, 0, nums.length - 1);

        if (result2 == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result2);
        }

        if(result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    private static int linearSearch(int[] nums, int target) {
        for(int num: nums) {
            if (num == target) {
                return num;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] nums, int target, int left, int right) {
//        int left = 0;
//        int right = nums.length - 1;

        if(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            if(nums[mid] < target) {
                return binarySearch(nums, target, mid + 1, right);
            } else {
                return binarySearch(nums, target, left, mid - 1);
            }
        }

//        while(left <= right){
//            int mid = left + (right - left) / 2;
//            if(nums[mid] == target) {
//                return mid;
//            }
//            if(nums[mid] < target) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//        return -1;
        return -1;
    }
}