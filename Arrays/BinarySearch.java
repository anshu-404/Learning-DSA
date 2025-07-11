public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 67, 78, 89, 90, 100, 290};
        System.out.println(index(arr, 23));
    }

    static int index(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
