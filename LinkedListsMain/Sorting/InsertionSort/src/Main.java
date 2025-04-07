public class Main {
    public static void main(String[] args) {
        int arr[] = {6,5,2,8,9,4};
        int size = arr.length;

        for(int i=1; i<size; i++) {
            int key = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}