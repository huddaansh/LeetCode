/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int peak = findPeak(mountainArr, n);

        
        int left = searchInIncreasing(mountainArr, target, 0, peak);
        if (left != -1) {
            return left;
        }

        
        return searchInDecreasing(mountainArr, target, peak + 1, n - 1);
    }

    private int findPeak(MountainArray mountainArr, int n) {
        int low = 1, high = n - 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midVal = mountainArr.get(mid);
            int nextVal = mountainArr.get(mid + 1);

            if (midVal > mountainArr.get(mid - 1) && midVal > nextVal) {
                return mid;
            } else if (midVal > nextVal) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    private int searchInIncreasing(MountainArray mountainArr, int target, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midVal = mountainArr.get(mid);
            if (midVal == target) {
                return mid;
            } else if (midVal < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    private int searchInDecreasing(MountainArray mountainArr, int target, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midVal = mountainArr.get(mid);
            if (midVal == target) {
                return mid;
            } else if (midVal < target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}