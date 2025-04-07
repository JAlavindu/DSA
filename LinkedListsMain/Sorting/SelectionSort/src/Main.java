public class Main {
    public static void main(String[] args) {
        int nums[] = {6,5,2,8,9,4};
        int size = nums.length;
        int temp = 0;
        int minIndex = -1;

        System.out.println("Before sorting: ");
        for(int num : nums) {
            System.out.print(num + " ");
        }

        for(int i = 0; i < size-1; i++) {
            minIndex = i;
            for(int j = i+1; j < size; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }

                temp = nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i] = temp;

                System.out.println();
                for(int num : nums) {
                    System.out.print(num + " ");
                }
        }

        System.out.println("\nAfter sorting: ");
        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}