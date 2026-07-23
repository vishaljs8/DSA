class Solution {
    public int findFloor(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                ans = mid;     
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return ans;
    }

    
    public int findCeil(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                ans = mid;     
                low = mid + 1;
            } else if (arr[mid] > x) {
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int f = findFloor(nums, target);
        int c = findCeil(nums, target);
        return new int[]{f, c};

    }
}